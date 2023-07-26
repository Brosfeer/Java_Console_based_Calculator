package e_project_of_aptech;

import java.util.Scanner;

public class E_Project_of_Aptech {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double num1, num2;
        while (true) {
            System.out.println("Choose Number to Perform  a Function -------------  or Zero To Exit ");
            System.out.println(" 1 --> Addition ");
            System.out.println(" 2 --> Subtraction ");
            System.out.println(" 3 --> Multiplication ");
            System.out.println(" 4 --> Division ");
            System.out.println(" 5 --> Power ");
            System.out.println(" 6 --> Square ");
            System.out.println(" 7 --> Cube ");
            System.out.println(" 8 --> Square root ");
            System.out.println(" 9 --> Round, ");
            System.out.println(" 10 --> Ceiling, ");
            System.out.println(" 11 --> Floor, ");
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

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();  //Accept the first number
                    num2 = scanner.nextDouble();  //Accept the second number
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  //Adding the numbers
                    break;

                case 2:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                    break;

                case 6:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Square of " + num1 + " = " + (num1 * num1));
                    break;

                case 7:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Cube of " + num1 + " = " + (num1 * num1 * num1));
                    break;

                case 8:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root of " + num1 + " = " + Math.sqrt(num1));
                    break;

                case 9:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Round of " + num1 + " = " + Math.round(num1));
                    break;

                case 10:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ceiling of " + num1 + " = " + Math.ceil(num1));
                    break;

                case 11:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Floor of " + num1 + " = " + Math.floor(num1));
                    break;

                case 12:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Min value of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));
                    break;

                case 13:
                    System.out.println("Enter two numbers:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Max value of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));
                    break;

                case 14:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Sin of " + num1 + " = " + Math.sin(num1));
                    break;

                case 15:
                    System.out.println("Enter anumber:");
                    num1 = scanner.nextDouble();
                    System.out.println("Cos of " + num1 + " = " + Math.cos(num1));
                    break;

                case 16:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Asin of " + num1 + " = " + Math.asin(num1));
                    break;

                case 17:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Acos of " + num1 + " = " + Math.acos(num1));
                    break;

                case 18:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Atan of " + num1 + " = " + Math.atan(num1));
                    break;

                case 19:
                    System.out.println("Enter a number:");
                    num1 = scanner.nextDouble();
                    System.out.println("Exponential of " + num1 + " = " + Math.exp(num1));
                    break;

                case 20:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;

            } //end switch
        }  //end while loop

    } // end main method

}// end class 
