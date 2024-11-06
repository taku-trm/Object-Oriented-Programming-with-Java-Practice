class hello {

    public int age;
    public String sex;

    public void helloWorld() {
        System.out.println("Hello world");
    }

    public int intToDouble(double a) {
        // example of type casting
        return (int) a;
    }
}

class Statements {
    public void expression() {
        // to assign a value
        int a = 11;
        // to produce a value
        int value = 2 + 4;
    }

    public void control() {
        int n;
        if (5 > 3)
            n = 3;

        switch (n) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("world");
                break;
            case 3:
                System.out.println("the b");
        }

    }
}

public class Lecture3 {
    public static void main(String[] args) {
        hello greet = new hello();
        Statements stat = new Statements();

        greet.age = 15;
        greet.sex = "male";

        System.out.println("The student is " + greet.sex + " and of age " + greet.age);
        // greet.helloWorld();
        // int a, b;
        // a = 3;
        // float multiplier = 0.011f;

        // double multiplication = a * multiplier;
        // long narrow = 20;
        // b = (int) narrow;

        int a = greet.intToDouble(99.99);
        System.out.println("the new in value is:" + a);
        int x = 4;
        String b = (x % 2 == 0) ? "4 is even " : "4 is odd";
        System.out.println(b);
    }
}
