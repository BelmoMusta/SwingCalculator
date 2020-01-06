/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musta.belmo.swing.calculator;

/**
 * @author Belmostapha
 */
public class Rationnel extends Number {
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

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return ((float) a) / b;
    }

    @Override
    public double doubleValue() {
        return ((double) a) / b;
    }

    public Rationnel(int aa, int bb) {
        if (bb == 0) {
            throw new NumberFormatException("the divident cannot be null");
        }
        b = bb;
        a = aa;

    }

    public Rationnel(int aa) {
        b = 1;
        a = aa;

    }

    public void normaliser() {
        int c = Maths.pgcd(a, b);
        a = a / c;
        b = b / c;
        if (b < 0) {
            a = -a;
            b = -b;
        }
    }

    public Rationnel pow(int pow) {
        int aa = (int) Math.pow(a, pow);
        int bb = (int) Math.pow(b, pow);
        Rationnel rationnel = new Rationnel(aa, bb);
        rationnel.normaliser();
        return rationnel;
    }

    public Rationnel add(Rationnel left) {
        return addOrSubtract(left, 1);

    }

    public Rationnel add(int left) {
        return addOrSubtract(left, 1);

    }

    public Rationnel subtract(Rationnel left) {
        return addOrSubtract(left, -1);
    }

    public Rationnel subtract(int left) {
        return addOrSubtract(left, -1);
    }

    public Rationnel multiply(Rationnel left) {
        return new Rationnel(a * left.a, b * left.b);
    }

    public Rationnel multiply(int left) {
        return multiply(new Rationnel(left));
    }

    public Rationnel divide(Rationnel left) {
        return this.multiply(left.inverse());
    }

    public Rationnel divide(int left) {
        return this.multiply(new Rationnel(left).inverse());
    }

    public Rationnel inverse() {
        return new Rationnel(b, a);
    }

    private Rationnel addOrSubtract(Rationnel left, int coefficient) {
        int aa = a * left.b + coefficient * (b * left.a);
        int bb = b * left.b;
        final Rationnel rationnel = new Rationnel(aa, bb);
        return rationnel;
    }

    private Rationnel addOrSubtract(int left, int coefficient) {
        return addOrSubtract(new Rationnel(left), coefficient);
    }

    public static void main(String[] args) {
        Rationnel rationnel = new Rationnel(1, 2);
        System.out.println("rationnel.multiply(rationnel) = " + rationnel.multiply(5));
    }

}