package musta.belmo.swing.calculator;

import static java.lang.Math.PI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Belmostapha
 */
public class Verifier {
     public static boolean isNumber(String s){
        boolean b=true;
         try {
             Double.parseDouble(s);
         //    Integer.parseInt(s);
         } catch (NumberFormatException e) {
             b=false;
         }
        return b;
 }
      public static double toGrades(double angrad) {
        return angrad * PI/200.0 ;
    }
      
}
