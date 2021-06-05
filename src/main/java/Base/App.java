/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String firstNumber = getNumber("first");
        String  secondNumber = getNumber("second");
        double number1 = stringToDouble(firstNumber);
        double number2 = stringToDouble(secondNumber);
        double addRes = doMath(1, number1, number2);
        double subRes = doMath(2, number1, number2);
        double multRes = doMath(3, number1, number2);
        double divRes = doMath(4, number1, number2);
        printResults(number1, number2, addRes, subRes, multRes, divRes);
    }
    public static String getNumber(String number)
    {
        System.out.printf("What is the %s number? ", number);
        return in.nextLine();
    }

    public static double stringToDouble(String number)
    {
        return Double.parseDouble(number);
    }

    public static double doMath(int selector, double number1, double number2)
    {
        switch (selector)
        {
            case 1:
                return number1 + number2;
            case 2:
                return number1 - number2;
            case 3:
                return number1 * number2;
            case 4:
                return number1 /= number2;
            default:
                System.out.println("Switch statement error.");
                return -1;
        }
    }

    public static void printResults(double number1, double number2, double addRes, double subRes,
                                    double multRes, double divRes)
    {
        System.out.printf( "%.0f + %.0f = %.0f\n%.0f - %.0f = %.0f\n%.0f * %.0f = %.0f\n%.0f / %.0f = %.0f",
                number1, number2, addRes, number1, number2, subRes, number1, number2, multRes, number1, number2, divRes );
    }
}
