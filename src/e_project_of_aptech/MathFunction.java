package e_project_of_aptech;

import java.util.Scanner;

public class MathFunction extends CheckBool {

    Scanner scanner = new Scanner(System.in);

    double num1, num2;

    public void addition() {
        System.out.println("Enter two numbers for the Addition:");
        num1 = scanner.nextDouble();  // Accept the first number
        num2 = scanner.nextDouble();  // Accept the second number
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  // Adding the numbers
    }

    public void subtraction() {
        System.out.println("Enter two numbers for the Subtraction:");
        num1 = scanner.nextDouble(); // Accept the first number
        num2 = scanner.nextDouble(); // Accept the second number
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiplication() {
        System.out.println("Enter two numbers for the Multiplication:");
        num1 = scanner.nextDouble(); // Accept the first number
        num2 = scanner.nextDouble(); // Accept the second number
        System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void division() {
        System.out.println("Enter two numbers for the Division:");
        num1 = scanner.nextDouble(); // Accept the dividend
        num2 = scanner.nextDouble(); // Accept the divisor
        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public void power() {
        System.out.println("Enter two numbers for the Power:");
        num1 = scanner.nextDouble(); // Accept the base
        num2 = scanner.nextDouble(); // Accept the exponent
        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
    }

    public void square() {
        System.out.println("Enter a number to get its Square:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Result: Square of " + num1 + " = " + (num1 * num1));
    }

    public void cube() {
        System.out.println("Enter a number to get its Cube:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Result: Cube of " + num1 + " = " + (num1 * num1 * num1));
    }

    public void squareRote() {
        System.out.println("Enter a number to get its Square root:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Square root of " + num1 + " = " + String.format("%.2f", Math.sqrt(num1)));
    }

    public void round() {
        System.out.println("Enter a number to get its Round:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Round of " + num1 + " = " + Math.round(num1));
    }

    public void ceilling() {
        System.out.println("Enter a number to get the Ceiling:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Ceiling of " + num1 + " = " + Math.ceil(num1));
    }

    public void floor() {
        System.out.println("Enter a number to get the Floor:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Floor of " + num1 + " = " + Math.floor(num1));
    }

    public void minValue() {
        System.out.println("Enter two numbers to know which is the min value:");
        num1 = scanner.nextDouble(); // Accept the first number
        num2 = scanner.nextDouble(); // Accept the second number
        System.out.println("Min value of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));
    }

    public void maxValue() {
        System.out.println("Enter two numbers to know the max value:");
        num1 = scanner.nextDouble(); //Accept the first number
        num2 = scanner.nextDouble(); //Accept the second number
        System.out.println("Max value of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));
    }

    public void sin() {
        System.out.println("Enter a number to get its sine:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Sine of " + num1 + " = " + Math.sin(num1));
    }

    public void cos() {
        System.out.println("Enter a number to get its cosine:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Cosine of " + num1 + " = " + Math.cos(num1));
    }

    public void asin() {
        System.out.println("Enter a number to get its cosine:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Cosine of " + num1 + " = " + Math.asin(num1));
    }

    public void acos() {
        System.out.println("Enter a number to get its arccosine:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Arccosine of " + num1 + " = " + Math.acos(num1));
    }

    public void atan() {
        System.out.println("Enter a number to get its arctangent:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Arctangent of " + num1 + " = " + Math.atan(num1));
    }

    public void exponential() {
        System.out.println("Enter a number to get its exponential:");
        num1 = scanner.nextDouble(); // Accept the number
        System.out.println("Exponential of " + num1 + " = " + Math.exp(num1));
    }

    public void palindrome() {
        System.out.println("Enter a number to check if it's a palindrome:");
        int num = scanner.nextInt(); // Accept the number
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public void armStrong() {
        System.out.println("Enter a number to check if the number is an Armstrong number or not:");
        num1 = scanner.nextInt(); // Accept the number
        if (isArmstrong(num1)) {
            System.out.println(num1 + " is an Armstrong number");
        } else {
            System.out.println(num1 + " is not an Armstrong number");
        }
    }

    public void prime() {
        System.out.println("Enter any number to check if it's a prime number:");
        int num = scanner.nextInt(); // Accept the number
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number!");
        } else {
            System.out.println(num + " is not a prime number!");
        }
    }

    public void avarage() {
        System.out.println("How many numbers do you want to find the average of?");
        int count = scanner.nextInt(); // Accept the number
        int sum = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt(); // Accept the numbers and calculate the sum
        }
        double average = (double) sum / count;
        System.out.println("Average is " + String.format("%.2f", average));
    }

    public void gcd() {
        System.out.println("Enter two numbers to find their GCD:");
        num1 = scanner.nextDouble(); // Accept the first number
        num2 = scanner.nextDouble(); // Accept the second number
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
    }

    public void lcm() {
        System.out.print("Enter the first number to find their LCM: ");
        num1 = scanner.nextDouble(); // Accept the first number

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble(); // Accept the second number

        double gcd = findGCD(num1, num2);
        double lcm = (num1 * num2) / gcd;

        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

}
