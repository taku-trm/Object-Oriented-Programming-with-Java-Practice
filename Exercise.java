import java.util.Scanner;

class Weather {
    public double convertFtoC(int farenheight) {
        System.out.println("The celcius value is: ");
        return (farenheight - 32) * 5 / 9;
    }
}

class Numbers {

    public double quadratic(double a, double b, double c) {
        double discriminant = Math.pow(2, b) - 4 * a * c;
        if (discriminant == 0) {
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

    public String oddEven(int a) {
        return (a % 2 == 0) ? "the number is even" : "The number is odd";
    }

    public String prime(int a) {
        if (a <= 1) {
            return "Not a prime number";
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return "Not a prime number";
            }
        }
        return "Prime number";
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
        System.out.println("Choose function: ");
        System.out.println("Check if odd/ even enter 1 ");
        System.out.println("Check if number is a Prime number enter 2");
        System.out.println("To Swap two numbers enter 3");
        System.out.println("To Convert from Farenheight to Celsius press 4");
        System.out.println("To solve Quadratic equation press 5");
        int select = input.nextInt();

        switch (select) {
            case 1:
                num.oddEven(10);
                break;
            case 2:
                num.prime(11);
                break;
            case 3:
                num.swap(10, 20);
                break;
            case 4:
                weather.convertFtoC(32);
                break;
            case 5:
                num.quadratic(2, 8, 9);
                break;
        }

    }

}
