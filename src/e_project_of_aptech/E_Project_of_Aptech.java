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

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double findGCD(double num1, double num2) {
        while (num2 != 0) {
            double temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

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

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter two numbers for the Addition:");
                    num1 = scanner.nextDouble();  //Accept the first number
                    num2 = scanner.nextDouble();  //Accept the second number
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  //Adding the numbers
                    break;

                case 2:
                    System.out.println("Enter two numbers for the Subtraction :");
                    num1 = scanner.nextDouble(); //Accept the first number
                    num2 = scanner.nextDouble(); //Accept the second number
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Enter two numbers for the Multiplication :");
                    num1 = scanner.nextDouble(); //Accept the first number
                    num2 = scanner.nextDouble();//Accept the second number
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Enter two numbers for the Division :");
                    num1 = scanner.nextDouble();//Accept the first number
                    num2 = scanner.nextDouble();//Accept the second number
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("Enter two numbers for the Power :");
                    num1 = scanner.nextDouble();//Accept the first number
                    num2 = scanner.nextDouble();//Accept the second number
                    System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                    break;

                case 6:
                    System.out.println("Enter a number to get the Square :");
                    num1 = scanner.nextDouble();//Accept the number
                    System.out.println("Square of " + num1 + " = " + (num1 * num1));
                    break;

                case 7:
                    System.out.println("Enter a number to get its Cube :");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Cube of " + num1 + " = " + (num1 * num1 * num1));
                    break;

                case 8:
                    System.out.println("Enter a number to get its Square root :");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Square root of " + num1 + " = " + String.format("%.2f", Math.sqrt(num1)));
                    break;

                case 9:
                    System.out.println("Enter a number to get its Round:");
                    num1 = scanner.nextDouble();//Accept the number
                    System.out.println("Round of " + num1 + " = " + Math.round(num1));
                    break;

                case 10:
                    System.out.println("Enter a number to get the Ceiling :");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Ceiling of " + num1 + " = " + Math.ceil(num1));
                    break;

                case 11:
                    System.out.println("Enter a number to get the Floor :");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Floor of " + num1 + " = " + Math.floor(num1));
                    break;

                case 12:
                    System.out.println("Enter two numbers to know which is the min value:");
                    num1 = scanner.nextDouble(); //Accept the first number
                    num2 = scanner.nextDouble(); //Accept the second number
                    System.out.println("Min value of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));
                    break;

                case 13:
                    System.out.println("Enter two numbers to know the max value:");
                    num1 = scanner.nextDouble(); //Accept the first number
                    num2 = scanner.nextDouble(); //Accept the second number
                    System.out.println("Max value of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));
                    break;

                case 14:
                    System.out.println("Enter a number to get its sin:");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Sin of " + num1 + " = " + Math.sin(num1));
                    break;

                case 15:
                    System.out.println("Enter anumber to get its Cos:");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Cos of " + num1 + " = " + Math.cos(num1));
                    break;

                case 16:
                    System.out.println("Enter a number to get its Asin:");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Asin of " + num1 + " = " + Math.asin(num1));
                    break;

                case 17:
                    System.out.println("Enter a number to get its Acons:");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Acos of " + num1 + " = " + Math.acos(num1));
                    break;

                case 18:
                    System.out.println("Enter a number to get its Atan:");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Atan of " + num1 + " = " + Math.atan(num1));
                    break;

                case 19:
                    System.out.println("Enter a number: to get the Exponential");
                    num1 = scanner.nextDouble(); //Accept the number
                    System.out.println("Exponential of " + num1 + " = " + Math.exp(num1));
                    break;

                case 20:

                    System.out.println("Enter a number to chech if its Palindrome or not :");

                    int num = scanner.nextInt(); //Accept the number
                    if (isPalindrome(num)) {
                        System.out.println(num + " is Palindrome");
                    } else {
                        System.out.println(num + " is not Palindrome");
                    }
                    break;

                case 21:

                    System.out.println("Enter a number to check if the number is an Armstrong or not:");
                    num = scanner.nextInt(); //Accept the number
                    if (isArmstrong(num)) {
                        System.out.println(num + " is an Armstrong number ");
                    } else {
                        System.out.println(num + " is not an Armstrong number");
                    }
                    break;

                case 22:
                    System.out.println("Enter Any number to check if its Prime or not");
                    num = scanner.nextInt(); //Accept the number
                    boolean isPrime = isPrime(num);
                    if (isPrime) {
                        System.out.println(num + " is a prime number!");
                    } else {
                        System.out.println(num + " is not a prime number!");
                    }
                    break;

                case 23:
                    System.out.println("how many nuber you want the avrage of them");
                    int count = scanner.nextInt(); //Accept the number
                    int sum = 0;
                    System.out.println("Enter the numbers :");
                    for (int i = 0; i < count; i++) {
                        sum += scanner.nextInt(); //accept the numbers and calc the sum
                    }
                    double average = (double) sum / count;
                    System.out.println("Average is " + String.format("%.2f", average));
                    break;

                case 24:
                    System.out.println("Enter two numbers to find their GCD :");
                    num1 = scanner.nextDouble(); //Accept the first number
                    num2 = scanner.nextDouble(); //Accept the second number
                    System.out.println("GCD of " + num1 + "  and  " + num2 + "  is  " + findGCD(num1, num2));
                    break;

                case 25:
                    System.out.print("Enter the first number to find their LCM : ");
                    num1 = scanner.nextDouble(); //Accept the first number

                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble(); //Accept the first number

                    double gcd = findGCD(num1, num2);
                    double lcm = (num1 * num2) / gcd;

                    System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
                    break;
                default:
                    System.out.println("Thanks for Usage");
                    return;

            } //end switch
        }  //end while loop

    } // end main method

}// end class 
