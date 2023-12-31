/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_project_of_aptech;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ListOption extends MathFunction {

    public static void OptionList() {
        Scanner scanner = new Scanner(System.in);
        MathFunction math = new MathFunction();
        int option = 0;
        while (true) {
            System.out.println("Welcome to Java Console Based Caluculator *__* ");
            System.out.println("Choose Number to Perform  a Function -------------  or Zero To Exit ");
            System.out.println(" 1 --> Addition ");
            System.out.println(" 2 --> Subtraction ");
            System.out.println(" 3 --> Multiplication ");
            System.out.println(" 4 --> Division ");
            System.out.println(" 5 --> Power ");
            System.out.println(" 6 --> Square ");
            System.out.println(" 7 --> Cube ");
            System.out.println(" 8 --> Square root ");
            System.out.println(" 9 --> Round ");
            System.out.println(" 10 --> Ceiling ");
            System.out.println(" 11 --> Floor ");
            System.out.println(" 12 --> Min Value ");
            System.out.println(" 13 --> Max Value ");
            System.out.println(" 14 --> Sin ");
            System.out.println(" 15 --> Cos ");
            System.out.println(" 16 --> Asin ");
            System.out.println(" 17 --> Acos ");
            System.out.println(" 18 --> Atan ");
            System.out.println(" 19 --> Exponential ");
            System.out.println(" 20 --> Palindrome, ");
            System.out.println(" 21 --> Armstrong number ");
            System.out.println(" 22 --> Prime number ");
            System.out.println(" 23 --> Average ");
            System.out.println(" 24 --> GCD ");
            System.out.println(" 25 --> LCM ");
            System.out.println(" 0 --> Exit ");

            // Prompt the user to choose an option
            boolean validValue = false;
            while (!validValue) {
                try {
                    option = Integer.parseInt(scanner.next());
                    validValue = true;
                } catch (Exception e) {
                    System.out.println("Enter Valid number and try again");
                }
            }

            // Perform calculations based on the chosen option
            switch (option) {
                case 1:
                    //Calculate the Addition
                    math.addition();
                    break;
                case 2:
                    //Calculate the Subtraction
                    math.subtraction();
                    break;
                case 3:
                    //Calculate the Multiplication
                    math.multiplication();
                    break;
                case 4:
                    //Calculate the Division
                    math.division();
                    break;
                case 5:
                    //Calculate the Power
                    math.power();
                    break;
                case 6:
                    //Calculate the Square
                    math.square();
                    break;
                case 7:
                    //Calculate the Cube
                    math.cube();
                    break;
                case 8:
                    //Calculate the Square root
                    math.squareRote();
                    break;
                case 9:
                    //Calculate the Round
                    math.round();
                    break;
                case 10:
                    //  Calculate the Ceiling
                    math.ceilling();
                    break;
                case 11:
                    //  Calculate the Floor
                    math.floor();
                    break;
                case 12:
                    //  Calculate the Min value
                    math.minValue();
                    break;
                case 13:
                    // Calculate theMax value
                    math.maxValue();
                    break;
                case 14:
                    // Calculate the sine of a number
                    math.sin();
                    break;
                case 15:
                    // Calculate the cosine of a number
                    math.cos();
                    break;
                case 16:
                    // Calculate the arcsine of a number
                    math.asin();
                    break;
                case 17:
                    // Calculate the arccosine of a number
                    math.acos();
                    break;
                case 18:
                    // Calculate the arctangent of a number
                    math.atan();
                    break;
                case 19:
                    // Calculate the exponential of a number
                    math.exponential();
                    break;
                case 20:
                    // Check if a number is a palindrome
                    math.palindrome();
                    break;
                case 21:
                    // Check if a number is an Armstrong number
                    math.armStrong();
                    break;
                case 22:
                    // Check if a number is a prime number
                    math.prime();
                    break;
                case 23:
                    // Calculate the average of multiple numbers
                    math.avarage();
                    break;
                case 24:
                    // Find the greatest common divisor (GCD) of two numbers
                    math.gcd();
                    break;
                case 25:
                    // Find the least common multiple (LCM) of two numbers
                    math.lcm();
                    break;
                default:
                    System.out.println("Please Choose feom the given List");
                    continue;

            } //End switch
        }  //End while loop

    }
}
