package e_project_of_aptech;

import java.util.Scanner;

public class E_Project_of_Aptech {

    /**
     *
     * This method takes an integer as input and checks if it is a palindrome
     * number or not.
     *
     * @return true if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
// Reverse the number by extracting its digits one by one and adding them in reverse order.
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
// Compare the original number with the reversed number to check if it is a palindrome.
        return original == reversed;
    }

    /**
     * Checks if a given number is an Armstrong number.
     *
     * @param number The number to be checked.
     * @return True if the number is an Armstrong number, false otherwise.
     */
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    /**
     * Checks if a given number is prime.
     *
     * @param number The number to be checked.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number between 2 and itself, it is not prime.
            }
        }
        return true; // If the loop completes without finding any divisors, the number is prime.
    }

    /**
     * Finds the greatest common divisor (GCD) of two numbers.
     *
     *
     * @return The greatest common divisor of num1 and num2.
     */
    public static double findGCD(double num1, double num2) {
        while (num2 != 0) {
            double temp = num2; // @param num1 The first number.
            num2 = num1 % num2; // @param num2 The second number.
            num1 = temp;
        }
        return num1;
    }

    /**
     * The main method for running the program. Provides a menu for the user to
     * choose a mathematical or number-related function.
     *
     */
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
            option = scanner.nextInt();

// Perform calculations based on the chosen option
            switch (option) {
                case 1:
                    // Addition
                    System.out.println("Enter two numbers for the Addition:");
                    num1 = scanner.nextDouble();  // Accept the first number
                    num2 = scanner.nextDouble();  // Accept the second number
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  // Adding the numbers
                    break;

                case 2:
                    // Subtraction
                    System.out.println("Enter two numbers for the Subtraction:");
                    num1 = scanner.nextDouble(); // Accept the first number
                    num2 = scanner.nextDouble(); // Accept the second number
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    // Multiplication
                    System.out.println("Enter two numbers for the Multiplication:");
                    num1 = scanner.nextDouble(); // Accept the first number
                    num2 = scanner.nextDouble(); // Accept the second number
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    // Division
                    System.out.println("Enter two numbers for the Division:");
                    num1 = scanner.nextDouble(); // Accept the dividend
                    num2 = scanner.nextDouble(); // Accept the divisor
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    break;

                case 5:
                    // Power
                    System.out.println("Enter two numbers for the Power:");
                    num1 = scanner.nextDouble(); // Accept the base
                    num2 = scanner.nextDouble(); // Accept the exponent
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                    break;

                case 6:
                    // Square
                    System.out.println("Enter a number to get its Square:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Result: Square of " + num1 + " = " + (num1 * num1));
                    break;

                case 7:
                    // Cube
                    System.out.println("Enter a number to get its Cube:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Result: Cube of " + num1 + " = " + (num1 * num1 * num1));
                    break;

                case 8:
                    // Square root
                    System.out.println("Enter a number to get its Square root:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Square root of " + num1 + " = " + String.format("%.2f", Math.sqrt(num1)));
                    break;

                case 9:
                    // Round
                    System.out.println("Enter a number to get its Round:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Round of " + num1 + " = " + Math.round(num1));
                    break;

                case 10:
                    // Ceiling
                    System.out.println("Enter a number to get the Ceiling:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Ceiling of " + num1 + " = " + Math.ceil(num1));
                    break;

                case 11:
                    // Floor
                    System.out.println("Enter a number to get the Floor:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Floor of " + num1 + " = " + Math.floor(num1));
                    break;

                case 12:
                    // Min value
                    System.out.println("Enter two numbers to know which is the min value:");
                    num1 = scanner.nextDouble(); // Accept the first number
                    num2 = scanner.nextDouble(); // Accept the second number
                    System.out.println("Min value of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));
                    break;

                case 13:
                    //Max value
                    System.out.println("Enter two numbers to know the max value:");
                    num1 = scanner.nextDouble(); //Accept the first number
                    num2 = scanner.nextDouble(); //Accept the second number
                    System.out.println("Max value of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));
                    break;

                case 14:
                    // Calculate the sine of a number
                    System.out.println("Enter a number to get its sine:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Sine of " + num1 + " = " + Math.sin(num1));
                    break;

                case 15:
                    // Calculate the cosine of a number
                    System.out.println("Enter a number to get its cosine:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Cosine of " + num1 + " = " + Math.cos(num1));
                    break;

                case 16:
                    // Calculate the arcsine of a number
                    System.out.println("Enter a number to get its arcsine:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Arcsine of " + num1 + " = " + Math.asin(num1));
                    break;

                case 17:
                    // Calculate the arccosine of a number
                    System.out.println("Enter a number to get its arccosine:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Arccosine of " + num1 + " = " + Math.acos(num1));
                    break;

                case 18:
                    // Calculate the arctangent of a number
                    System.out.println("Enter a number to get its arctangent:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Arctangent of " + num1 + " = " + Math.atan(num1));
                    break;

                case 19:
                    // Calculate the exponential of a number
                    System.out.println("Enter a number to get its exponential:");
                    num1 = scanner.nextDouble(); // Accept the number
                    System.out.println("Exponential of " + num1 + " = " + Math.exp(num1));
                    break;

                case 20:
                    // Check if a number is a palindrome
                    System.out.println("Enter a number to check if it's a palindrome:");
                    int num = scanner.nextInt(); // Accept the number
                    if (isPalindrome(num)) {
                        System.out.println(num + " is a palindrome");
                    } else {
                        System.out.println(num + " is not a palindrome");
                    }
                    break;

                case 21:
                    // Check if a number is an Armstrong number
                    System.out.println("Enter a number to check if the number is an Armstrong number or not:");
                    num = scanner.nextInt(); // Accept the number
                    if (isArmstrong(num)) {
                        System.out.println(num + " is an Armstrong number");
                    } else {
                        System.out.println(num + " is not an Armstrong number");
                    }
                    break;

                case 22:
                    // Check if a number is a prime number
                    System.out.println("Enter any number to check if it's a prime number:");
                    num = scanner.nextInt(); // Accept the number
                    boolean isPrime = isPrime(num);
                    if (isPrime) {
                        System.out.println(num + " is a prime number!");
                    } else {
                        System.out.println(num + " is not a prime number!");
                    }
                    break;

                case 23:
                    // Calculate the average of multiple numbers
                    System.out.println("How many numbers do you want to find the average of?");
                    int count = scanner.nextInt(); // Accept the number
                    int sum = 0;
                    System.out.println("Enter the numbers:");
                    for (int i = 0; i < count; i++) {
                        sum += scanner.nextInt(); // Accept the numbers and calculate the sum
                    }
                    double average = (double) sum / count;
                    System.out.println("Average is " + String.format("%.2f", average));
                    break;

                case 24:
                    // Find the greatest common divisor (GCD) of two numbers
                    System.out.println("Enter two numbers to find their GCD:");
                    num1 = scanner.nextDouble(); // Accept the first number
                    num2 = scanner.nextDouble(); // Accept the second number
                    System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
                    break;

                case 25:
                    // Find the least common multiple (LCM) of two numbers
                    System.out.print("Enter the first number to find their LCM: ");
                    num1 = scanner.nextDouble(); // Accept the first number

                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble(); // Accept the second number

                    double gcd = findGCD(num1, num2);
                    double lcm = (num1 * num2) / gcd;

                    System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
                    break;

                default:
                    System.out.println("Thanks for using the program");
                    return;

            } //End switch
        }  //End while loop

    } // End main method

}// End class 
