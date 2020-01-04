/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musta.belmo.swing.calculator;

import java.util.Scanner;

/**
 * @author Belmostapha
 */
public class Maths {
    static int pgcd(int a, int b) {
        if (a < b) {
            int t = b;
            b = a;
            a = t;
        }
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;


        }

        return a < 0 ? -a : a;

    }

    static boolean isNum(char c) {
        return (c >= '0' && c <= '9');
    }

    static double evalDiv(String s) {
        double a, b;
        Scanner sc;

        String aa = "", bb = "";

        int i = 0;
        while (isNum(s.charAt(i))) {
            aa = aa + s.charAt(i);
            i++;
        }
        int j = s.length() - 1;
        while (isNum(s.charAt(j))) {
            bb = s.charAt(j) + bb;
            j--;
        }

        a = (Double.parseDouble(aa));
        b = (Double.parseDouble(bb));


        return a / b;
    }

    static double evalPlus(String s) {
        double a, b;

        String aa = "", bb = "";

        int i = 0;
        while (isNum(s.charAt(i))) {
            aa = aa + s.charAt(i);
            i++;
        }
        int j = s.length() - 1;
        while (isNum(s.charAt(j))) {
            bb = s.charAt(j) + bb;
            j--;
        }

        a = (Double.parseDouble(aa));
        b = (Double.parseDouble(bb));


        return a + b;
    }

    static double evalMin(String s) {
        double a, b;

        String aa = "", bb = "";

        int i = 0;
        while (isNum(s.charAt(i))) {
            aa = aa + s.charAt(i);
            i++;
        }
        int j = s.length() - 1;
        while (isNum(s.charAt(j))) {
            bb = s.charAt(j) + bb;
            j--;
        }

        a = (Double.parseDouble(aa));
        b = (Double.parseDouble(bb));


        return a - b;
    }

    static double evalMul(String s) {
        double a, b;

        String aa = "", bb = "";

        int i = 0;
        while (isNum(s.charAt(i))) {
            aa = aa + s.charAt(i);
            i++;
        }
        int j = s.length() - 1;
        while (isNum(s.charAt(j))) {
            bb = s.charAt(j) + bb;
            j--;
        }

        a = (Double.parseDouble(aa));
        b = (Double.parseDouble(bb));


        return a * b;
    }

    public static void main(String[] args) {
        String s = "8/4/4";
        System.out.println(evalDiv(s));
        // System.out.println(evalPlus(s));
        // System.out.println(evalMin(s));
        // System.out.println(evalMul(s));
        //  System.out.println(Double.parseDouble("1/23"));

    }
}