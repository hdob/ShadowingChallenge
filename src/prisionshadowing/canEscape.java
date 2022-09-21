/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisionshadowing;

/**
 *
 * @author hecto
 */


public class canEscape {
    
    int givenSteps,prisonerResistance;
    
    public canEscape(int pasosDados, int resistenciaPrisionero){
        this.givenSteps=pasosDados;
        this.prisonerResistance=resistenciaPrisionero;
    }
    
     public boolean Evaluar(){
         boolean flagEscape=false;
         if(givenSteps<=prisonerResistance && givenSteps>0){
             flagEscape=true;
         }
         return flagEscape;
     }
}
