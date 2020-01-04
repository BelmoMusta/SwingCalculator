/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musta.belmo.swing.calculator;

/**
 * @author Belmostapha
 */
public class Rationnel {
    int a;
    int b;

    public String toString() {
        if (b == 1) return String.valueOf(a);
        return a + "/" + b;
    }

    public Rationnel() {
        a = 0;
        b = 1;

    }

    public Rationnel(int aa, int bb) {
        b = (bb != 0 ? bb : 1);
        a = aa;

    }

    public Rationnel(int aa) {
        b = 1;
        a = aa;

    }

    public void normaliser() {
        //  if(a%Maths.pgcd(a, b)==0 && b%Maths.pgcd(a, b)==0){
        int c = Maths.pgcd(a, b);
        a = a / c;
        b = b / c;
        if (b < 0) {
            a = -a;
            b = -b;
        }


        //}


    }


}