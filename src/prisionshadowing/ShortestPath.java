
package prisionshadowing;

import java.util.*;
/**
 *
 * @author hecto
 */
class Node {
// (x, y) representa las coordenadas de una celda en la matriz
    int x, y,dist;
    Node parent;
  
    Node(int x, int y, int dist,Node parent)
    {
        this.x = x;
        this.y = y;
        this.dist = dist;
        this.parent = parent;
    }
 
    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
    
    
}
public class ShortestPath
{
    String [][] PrisionMatrix;
    int  PrisonerPositionX,  PrisonerPositionY,  ExitPositionX,  ExitPositionY;
    int givenSteps=0;
    // Posibles Movimientos (Arriba, Abajo, Izquierda, Derecha)
    private static final int[] row = { -1, 0, 0, 1 };
    private static final int[] col = { 0, -1, 1, 0 };
 
    // Validacion si el paso a dar es correcto, solo puede pasar por _, P, S
    private static boolean isvalidStep(String[][] mat, boolean[][] visited, int row, int col)
    {
        return (row >= 0) && (row < mat.length) && (col >= 0) && (col < mat[0].length)
                && (mat[row][col].equals("_") ||mat[row][col].equals("P")||mat[row][col].equals("S"))&& !visited[row][col];
    }
    //Almacena las coordenadas de los pasos dados para la ruta mas corta
    private static void findExitPath(Node node, List<String> path)
    {
        if (node != null) {
            findExitPath(node.parent, path);
            path.add(node.toString());
        }
    }
    //
 private static List<String>  findShortestPrisonerPath (String[][] mat, int i, int j, int x, int y)
    {
        // Inicializa la lista para almacenar el camino mas corto
        List<String> shortestPath = new ArrayList<>();
        
        if (mat == null || mat.length == 0 || mat[i][j].equals("|") || mat[x][y].equals("|")) {
            return shortestPath;
        }
        
        // Inicializa la matriz de la Prision
        int X = mat.length;
        int Y = mat[0].length;

        // construye una matriz para realizar un seguimiento de las celdas visitadas
        boolean[][] visitedSteps = new boolean[X][Y];
 
        // crea una queue vacía
        Queue<Node> queuePath = new ArrayDeque<>();
 
        // marca la celda de origen como visitada y pone en queue el nodo de origen
        visitedSteps[i][j] = true;
        queuePath.add(new Node(i, j, 0,null));
 
        // bucle hasta que la queuePath esté vacía
        while (!queuePath.isEmpty())
        {
            // sacar de la queue el nodo frontal y procesarlo
            Node node = queuePath.poll();
            // (i, j) representa una celda actual, y dist almacena su
            // distancia mínima desde la fuente
            i = node.x;
            j = node.y;
            
            int dist = node.dist;

            // si se encuentra la salida establece la ruta mas corta encontrada
            if (i == x && j == y)
            {
                findExitPath(node,shortestPath);
                break;
            }
            
            // comprueba los cuatro movimientos posibles desde la celda actual
            // y poner en queue cada movimiento válido

            for (int k = 0; k < 4; k++)
            {
                // comprobar si es posible ir a la posición
                // (i + row[k], j + col[k]) desde la posición actual
                if (isvalidStep(mat, visitedSteps, i + row[k], j + col[k]))
                {
                    // marca la siguiente celda como visitada y la pone en queue              
                    visitedSteps[i + row[k]][j + col[k]] = true;
                    queuePath.add(new Node(i + row[k], j + col[k], dist+1,node));
                    

                }
            }
        }
 
        if (shortestPath.size() > 0) {
            return shortestPath;
        }
        return shortestPath;
    }
    public ShortestPath(String [][] matriz, int PrisonerPositionX, int PrisonerPositionY, int ExitPositionX, int ExitPositionY){
            this.PrisionMatrix=matriz;
            this.PrisonerPositionX=PrisonerPositionX;
            this.PrisonerPositionY=PrisonerPositionY;
            this.ExitPositionX=ExitPositionX;
            this.ExitPositionY=ExitPositionY;
       }
    public List<String> shorterEscapeRoute()
    {
        List<String> path = findShortestPrisonerPath(this.PrisionMatrix, PrisonerPositionX, PrisonerPositionY, ExitPositionX, ExitPositionY);
        int min_dist = path.size();     
        this.givenSteps = min_dist;
        return path;
        
    }
}
