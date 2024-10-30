
//import java.util.*;
import java.util.Scanner;

class Weather {
    public double convertFtoC(double farenheight) {
        double result;
        result = (farenheight - 32) * 5 / 9;
        System.out.println("The celcius value is: " + result);
        return 0;
    }
}

class Numbers {

    public double quadratic(double a, double b, double c) {
        double discriminant = (Math.pow(b, 2)) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println("No real roots");
            return 0;
        } else if (discriminant == 0) {
            double x1 = -b / (2 * a);
            System.out.println("There is one real root " + x1);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("the first root is: " + x1);
            System.out.println("The second root is: " + x2);
        }
        return 0;
    }

    public int oddEven(int a) {
        String result;
        result = (a % 2 == 0) ? "The number is even" : "The number is odd";
        System.out.println(result);
        return 0;

    }

    public boolean prime(int a) {
        if (a <= 1) {
            System.out.println("The number " + a + " is not a prime number");
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(a); i++) { // Check up to the square root of a
            if (a % i == 0) {
                System.out.println("The number " + a + " is not a prime number");
                return false; // Found a divisor, not prime
            }
        }

        System.out.println("The number " + a + " is a prime number");
        return true; // No divisors found, it is prime
    }

    public int swap(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a is now " + a + " and b is now " + b);
        return 0;
    }

}

public class Exercise {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        Weather weather = new Weather();
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Choose function: \n1. Check oddity\n2. Check for Prime\n3. Swap numbers\n4. Convert F to C\n5. Quadratic\n6. Quit");

        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Enter the number you want to check:");
                int value = input.nextInt();
                num.oddEven(value);
                break;
            case 2:
                System.out.println("Enter the number you want to check:");
                int value2 = input.nextInt();
                num.prime(value2);
                break;
            case 3:
                System.out.println("enter the first value, a: ");
                int a1 = input.nextInt();
                System.out.println("enter the first value, b: ");
                int b2 = input.nextInt();
                num.swap(a1, b2);
                break;
            case 4:
                System.out.println("Enter the temperature in Farenheight:");
                int temp = input.nextInt();
                weather.convertFtoC(temp);
                break;
            case 5:
                System.out.println("Enter values in the order a, b, c respectively:");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                num.quadratic(a, b, c);
                break;
            case 6:
                System.out.println("Thank you for using our program");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
