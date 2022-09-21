/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisionshadowing;

import java.util.Random;

/**
 *
 * @author hecto
 */
public class calculatePrison {
     String Prisoner ="P",Step="_",Out="S",Wall="|",Guard1=">",Guard2="<",Guard3="V",Guard4="^",GuardWall="G";
    String  PrisionMatrix[][];
    String  PrisionMatrixGuardWalls[][];
    int PrisionMatrixHigh,PrisionMatrixWidth;        
    int ExitPositionX,ExitPositionY;
    int PrisonerPositionX,PrisonerPositionY;
    int numberofGuards,availableSteps,prisonerResistance;
    /**
     * @param args the command line arguments
     */
    public void prisionMatrix() {
        int minP=4,maxP=10;
        int high = (int)(Math.random()*(maxP-minP+1)+minP);
        int width = (int)(Math.random()*(maxP-minP+1)+minP);
        this.PrisionMatrix = new String[high][width];
        this.PrisionMatrixHigh=high;
        this.PrisionMatrixWidth=width;
    }
    
    public void exitPosition (){
        int minS=0;
        int ExitPositionX = (int)(Math.random()*((this.PrisionMatrixHigh-1)-minS+1)+minS);
        int ExitPositionY = (int)(Math.random()*((this.PrisionMatrixWidth-1)-minS+1)+minS);
        
        boolean FlagExitPosition = false;
        
        while(FlagExitPosition==false){
            if(ExitPositionX <this.PrisionMatrixHigh-1 && ExitPositionX !=0 && ExitPositionY != this.PrisionMatrixWidth-1 && ExitPositionY != 0  ){
                ExitPositionY = (int)(Math.random()*(this.PrisionMatrixWidth-minS+1)+minS);
            }else{
                FlagExitPosition=true;
            }
        }
       
        PrisionMatrix[ExitPositionX][ExitPositionY]=Out;
        this.ExitPositionX=ExitPositionX;
        this.ExitPositionY=ExitPositionY;
    }
    
    public void prisonerPosition(){
        int minPrisoner=0;
        int PrisonerPositionX = (int)(Math.random()*((this.PrisionMatrixHigh-1)-minPrisoner+1)+minPrisoner);
        int PrisonerPositionY = (int)(Math.random()*((this.PrisionMatrixWidth-1)-minPrisoner+1)+minPrisoner);

        boolean FlagPrisonerPosition = false;
        while(FlagPrisonerPosition==false){
            FlagPrisonerPosition=true;
            if(PrisonerPositionX-this.ExitPositionX == 1 || PrisonerPositionX-minPrisoner == -1){
                PrisonerPositionX = (int)(Math.random()*((this.PrisionMatrixHigh-2)-minPrisoner+1)+minPrisoner);
                FlagPrisonerPosition=false;
            }
            if(PrisonerPositionY-this.ExitPositionY == 1 || PrisonerPositionY-this.PrisionMatrixWidth == -1){
                PrisonerPositionY = (int)(Math.random()*((this.PrisionMatrixWidth-2)-minPrisoner+1)+minPrisoner);
                FlagPrisonerPosition=false;
            }

        }
        this.PrisionMatrix[PrisonerPositionX][PrisonerPositionY]= this.Prisoner;
        this.PrisonerPositionX= PrisonerPositionX;
        this.PrisonerPositionY= PrisonerPositionY;
    }
    public void guardPosition(){
        int minGuards=1,maxGuards=4;
        int numberofGuards = (int)(Math.random()*(maxGuards-minGuards+1)+minGuards);
        int minGuardPosition=1,guardPositionX =0,guardPositionY=0;
        boolean flagGuardPosition =false;
        for (int g =0;g<numberofGuards;g++){
            flagGuardPosition=false;
            if(g==0){
                while(flagGuardPosition==false){
                    guardPositionX= (int)(Math.random()*((this.PrisionMatrixHigh-2)-minGuardPosition+1)+minGuardPosition);
                    guardPositionY= (int)(Math.random()*((this.PrisionMatrixWidth-2)-minGuardPosition+1)+minGuardPosition);
                    if(this.PrisionMatrix[guardPositionX][guardPositionY]==null){
                        this.PrisionMatrix[guardPositionX][guardPositionY]=this.Guard1;
                        flagGuardPosition=true;
                    }
                    
                }
                
            }
            if(g==1){
                while(flagGuardPosition==false){
                    guardPositionX= (int)(Math.random()*((this.PrisionMatrixHigh-2)-minGuardPosition+1)+minGuardPosition);
                    guardPositionY= (int)(Math.random()*((this.PrisionMatrixWidth-2)-minGuardPosition+1)+minGuardPosition);
                    if(this.PrisionMatrix[guardPositionX][guardPositionY]==null){
                        this.PrisionMatrix[guardPositionX][guardPositionY]=this.Guard2;
                        flagGuardPosition=true;
                    }
                    
                }
            }
            if(g==2){
                while(flagGuardPosition==false){
                    guardPositionX= (int)(Math.random()*((this.PrisionMatrixHigh-2)-minGuardPosition+1)+minGuardPosition);
                    guardPositionY= (int)(Math.random()*((this.PrisionMatrixWidth-2)-minGuardPosition+1)+minGuardPosition);
                    if(this.PrisionMatrix[guardPositionX][guardPositionY]==null){
                        this.PrisionMatrix[guardPositionX][guardPositionY]=this.Guard3;
                        flagGuardPosition=true;
                    }
                    
                }
            }
            if(g==3){
                while(flagGuardPosition==false){
                    guardPositionX= (int)(Math.random()*((this.PrisionMatrixHigh-2)-minGuardPosition+1)+minGuardPosition);
                    guardPositionY= (int)(Math.random()*((this.PrisionMatrixWidth-2)-minGuardPosition+1)+minGuardPosition);
                    if(this.PrisionMatrix[guardPositionX][guardPositionY]==null){
                        this.PrisionMatrix[guardPositionX][guardPositionY]=this.Guard4;
                        flagGuardPosition=true;
                    }
                    
                }
            }
        }
        System.out.println("Cantidad Guardias: "+numberofGuards);
        this.numberofGuards=numberofGuards;
    }
    public void availableSteps(){
    
        int availableSteps = ((this.PrisionMatrixHigh-2)*(this.PrisionMatrixWidth-2))-this.numberofGuards-1;

        for(int i=1;i<this.PrisionMatrixHigh-1;i++){
            for(int j=1;j<this.PrisionMatrixWidth-1;j++){
                if(this.PrisionMatrix[i][j]==null){
                    this.PrisionMatrix[i][j]=this.Step;
                }
            }
        }
        
        
        this.prisonerResistance =  availableSteps;
        double insideWalls = availableSteps/4;
        System.out.println("Resistencia Prisionero: "+this.prisonerResistance);
        //Fin: Calcular la Resistencia del Prisionero
        //Inicio: Rellenar los muros de la prision
        boolean flagMuro=false;
        for (int h=0;h<this.PrisionMatrixHigh;h++){
            for (int l=0;l<this.PrisionMatrixWidth;l++){
                if(this.PrisionMatrix[h][l]==null){
                    this.PrisionMatrix[h][l]=this.Wall;
                }
                if(this.PrisionMatrix[h][l].equals(this.Step)){
                    Random random = new Random();
                    flagMuro = random.nextBoolean();
                    if(flagMuro==true && insideWalls>0){
                       this.PrisionMatrix[h][l]=this.Wall;
                       insideWalls--;
                    }
                
                }
                
            }
        }
    
    }
    public void prisionMatrixGuardWalls(){
        this.PrisionMatrixGuardWalls = this.PrisionMatrix;
        
        for (int x = 0; x<this.PrisionMatrixHigh;x++){
            for (int y = 0; y<this.PrisionMatrixWidth;y++){
                if(this.PrisionMatrixGuardWalls[x][y].equals(this.Guard1)){
                    if(y<this.PrisionMatrixWidth-2 && !this.PrisionMatrixGuardWalls[x][y+1].equals(this.Out)&& !this.PrisionMatrixGuardWalls[x][y+1].equals(this.Prisoner)){
                        this.PrisionMatrixGuardWalls[x][y+1]=this.GuardWall;
                    }
                }
                if(this.PrisionMatrixGuardWalls[x][y].equals(this.Guard2)){
                    if(y>0 && !this.PrisionMatrixGuardWalls[x][y-1].equals(this.Out)&& !this.PrisionMatrixGuardWalls[x][y-1].equals(this.Prisoner)){
                        this.PrisionMatrixGuardWalls[x][y-1]=this.GuardWall;
                    }
                }
                
                if(this.PrisionMatrixGuardWalls[x][y].equals(this.Guard3)){
                    if(x<this.PrisionMatrixHigh-2 && !this.PrisionMatrixGuardWalls[x+1][y].equals(this.Out)&& !this.PrisionMatrixGuardWalls[x+1][y].equals(this.Prisoner)){
                        this.PrisionMatrixGuardWalls[x+1][y]=this.GuardWall;
                    }
                }
                if(this.PrisionMatrixGuardWalls[x][y].equals(this.Guard4)){
                    if(x>0 && !this.PrisionMatrixGuardWalls[x-1][y].equals(this.Out)&& !this.PrisionMatrixGuardWalls[x-1][y].equals(this.Prisoner)){
                        this.PrisionMatrixGuardWalls[x-1][y]=this.GuardWall;
                    }
                }
            }
        }
    }
    public void createPrision(){
       this.prisionMatrix();
       this.exitPosition();
       this.prisonerPosition();
       this.guardPosition(); 
       this.availableSteps();
       this.prisionMatrixGuardWalls();
    }
}
