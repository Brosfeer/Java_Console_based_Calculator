package e_project_of_aptech;

import java.util.Scanner;

public class MathFunction extends CheckBool {

    Scanner scanner = new Scanner(System.in);

    double num1, num2;
    int num;

    public void addition() {
        System.out.println("Enter two numbers for the Addition:");
        getTwoInput();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  // Adding the numbers
    }

    public void subtraction() {
        System.out.println("Enter two numbers for the Subtraction:");
        getTwoInput();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiplication() {
        System.out.println("Enter two numbers for the Multiplication:");
        getTwoInput();
        System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void division() {
        System.out.println("Enter two numbers for the Division:");
        getTwoInput();
        System.out.println("Result: " + num1 + " / " + num2 + " = " + String.format("%.2f", (num1 / num2)));
    }

    public void power() {
        System.out.println("Enter two numbers for the Power:");
        getTwoInput();
        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + String.format("%.2f", Math.pow(num1, num2)));
    }

    public void square() {
        System.out.println("Enter a number to get its Square:");
        getInput();
        System.out.println("Result: Square of " + num1 + " = " + (num1 * num1));
    }

    public void cube() {
        System.out.println("Enter a number to get its Cube:");
        getInput();
        System.out.println("Result: Cube of " + num1 + " = " + String.format("%.2f", num1 * num1 * num1));
    }

    public void squareRote() {
        System.out.println("Enter a number to get its Square root:");
        getInput();
        System.out.println("Square root of " + num1 + " = " + String.format("%.2f", Math.sqrt(num1)));
    }

    public void round() {
        System.out.println("Enter a number to get its Round:");
        getInput();
        System.out.println("Round of " + num1 + " = " + Math.round(num1));
    }

    public void ceilling() {
        System.out.println("Enter a number to get the Ceiling:");
        getInput();
        System.out.println("Ceiling of " + num1 + " = " + Math.ceil(num1));
    }

    public void floor() {
        System.out.println("Enter a number to get the Floor:");
        getInput();
        System.out.println("Floor of " + num1 + " = " + Math.floor(num1));
    }

    public void minValue() {
        System.out.print("How many numbers do you want to compare to get the minimum value ");
        getIntInput();
        double[] numbers = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a number: ");
            getInput();
            numbers[i] = num1;
        }
        double minNum = numbers[0];
        for (int i = 1; i < num; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        System.out.println("The minimum value is: " + minNum);
    }

    public void maxValue() {
        System.out.print("How many numbers do you want to compare to get the maximum value? ");
        getIntInput();
        double[] numbers = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a number: ");
            getInput();
            numbers[i] = num1;
        }
        double maxNum = numbers[0];
        for (int i = 1; i < num; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        System.out.println("The maximum value is: " + maxNum);
    }

    public void sin() {
        System.out.println("Enter a number to get its sin:");
        getInput();
        System.out.println("SIN of " + num1 + " = " + String.format("%.2f", Math.sin(num1)));
    }

    public void cos() {
        System.out.println("Enter a number to get its cos:");
        getInput();
        System.out.println("COS of " + num1 + " = " + String.format("%.2f", Math.cos(num1)));
    }

    public void asin() {
        System.out.println("Enter a number to get its asin:");
        getInput();
        System.out.println("ASIN of " + num1 + " = " + String.format("%.2f", Math.asin(num1)));
    }

    public void acos() {
        System.out.println("Enter a number between (-1 - 1) to get its acos:");
        getInputAcos();
        System.out.println("ACOS of " + num1 + " = " + String.format("%.2f", Math.acos(num1)));
    }

    public void atan() {
        System.out.println("Enter a number to get its atan:");
        getInput();
        System.out.println("ATAN of " + num1 + " = " + String.format("%.2f", Math.atan(num1)));
    }

    public void exponential() {
        System.out.println("Enter a number to get its exponential:");
        getInput();
        System.out.println("Exponential of " + num1 + " = " + String.format("%.2f", Math.exp(num1)));
    }

    public void palindrome() {
        System.out.println("Enter a number to check if it's a palindrome:");
        getIntInput();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public void armStrong() {
        System.out.println("Enter a number to check if the number is an Armstrong number or not:");
        getIntInput();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public void prime() {
        System.out.println("Enter any number to check if it's a prime number:");
        getIntInput();
        boolean isPrime = isPrimeNo(num);
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
        getTwoInput();
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
    }

    public void lcm() {
        System.out.print("Enter two number to find their LCM: ");
        getTwoInput();
        double gcd = findGCD(num1, num2);
        double lcm = (num1 * num2) / gcd;

        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public void getTwoInput() {
        boolean validValue = false;
        while (!validValue) {
            try {
                num1 = Double.parseDouble(scanner.next());
                num2 = Double.parseDouble(scanner.next());
                validValue = true;
            } catch (Exception e) {
                System.out.println("Enter Valid number and try again");
            }
        }
    }

    public void getInput() {
        boolean validValue = false;
        while (!validValue) {
            try {
                num1 = Double.parseDouble(scanner.next());
                validValue = true;
            } catch (Exception e) {
                System.out.println("Enter Valid number and try again");
            }
        }
    }

    public void getIntInput() {
        boolean validValue = false;
        while (!validValue) {
            try {
                num = Integer.parseInt(scanner.next());
                validValue = true;
            } catch (Exception e) {
                System.out.println("Enter Valid number and try again");
            }
        }
    }

    public void getInputAcos() {
        boolean validValue = false;
        while (!validValue) {
            try {
                num1 = Double.parseDouble(scanner.nextLine());
                if (num1 >= -1 && num1 <= 1) {
                    validValue = true;
                } else {
                    System.out.println("Enter a number between -1 and 1");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number and try again");
            }
        }
    }

}
