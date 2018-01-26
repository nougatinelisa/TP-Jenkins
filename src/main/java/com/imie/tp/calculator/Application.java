package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.utils.KeyboardUtils;

public class Application {

    private Application() {}

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Process...
        // Display & Ask "Type of Operation ":
        //               - 1 : Addition
        //               - 2 : Subtraction
        //               - 3 : Diviside
        //               - 4 : Multiplication
        //               - 5 : Display History
        //               - 9 : Quit

        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        // If enter 9 => Quit application

        //TODO

        KeyboardUtils tool = new KeyboardUtils();

        String askedCommand = "Rentrez un premier nombre";
        String numberReturned = tool.readFromKeyboard(askedCommand);
        float value = Float.parseFloat(numberReturned);

        AdditionOperation add = new AdditionOperation(value);

        askedCommand = "Rentrez un deuxième nombre";
        numberReturned = tool.readFromKeyboard(askedCommand);
        float enteredNumber = Float.parseFloat(numberReturned);

        add.make(enteredNumber);
        System.out.println("Le résultat de votre opération est : " + add.getCurrentValue());
    }

}
