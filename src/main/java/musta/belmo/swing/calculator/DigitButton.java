package musta.belmo.swing.calculator;

import javax.swing.*;

public class DigitButton extends JButton {
    private final char digit;

    DigitButton(char chr) {
        digit = chr;
    }

    public char getDigit() {
        return digit;
    }

}
