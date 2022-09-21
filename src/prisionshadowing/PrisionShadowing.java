/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisionshadowing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hector
 */


public class PrisionShadowing {
    String [][] Matrix;
    String canEscapeMsg;
    List<String> shortestPath;
    int givenSteps,numberGuards,prisonerResistance;
    int PrisionMatrixHigh,PrisionMatrixWidth;
    boolean flagEscape;
     public void diplayPrison(){
        
        calculatePrison Prison= new calculatePrison();
        Prison.createPrision();
        ShortestPath ruta = new ShortestPath(Prison.PrisionMatrixGuardWalls,Prison.PrisonerPositionX,Prison.PrisonerPositionY,Prison.ExitPositionX,Prison.ExitPositionY);
        
        this.Matrix=Prison.PrisionMatrixGuardWalls;
        this.shortestPath = ruta.shorterEscapeRoute();
        this.prisonerResistance = Prison.prisonerResistance;
        this.PrisionMatrixHigh = Prison.PrisionMatrixHigh;
        this.PrisionMatrixWidth = Prison.PrisionMatrixWidth;
        this.numberGuards = Prison.numberofGuards;
        this.givenSteps = ruta.givenSteps;
        canEscape metodoEscape = new canEscape( this.givenSteps,this.prisonerResistance);
        if(this.shortestPath.size()<=0){
            this.canEscapeMsg="No hay rutas disponibles para escapar!";
        }
        if(ruta.givenSteps>0){
                this.flagEscape = metodoEscape.Evaluar();
                System.out.println("Metodo Escape Display: "+flagEscape);
                if(this.flagEscape==true){
                    this.canEscapeMsg="Advertencia! El prisionero ha escapado!";
                }else{
                    this.canEscapeMsg="El prisionero no tiene resistencia para escapar!";
                }
            }
        
    }
    public static void main(String[] args) {
        
       PrisonDesign displayPrison = new PrisonDesign();
       displayPrison.setVisible(true);
       calculatePrison Prison= new calculatePrison();
       Prison.createPrision();
       
        
        
    }
    
}
