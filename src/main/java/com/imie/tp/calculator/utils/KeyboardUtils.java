package com.imie.tp.calculator.utils;

import java.util.Scanner;

public final class KeyboardUtils {

    private static Scanner keyboard;

    public String readFromKeyboard(String displayAsk) {
        keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        return keyboard.nextLine();

        //keyboard.close();
    }
}
