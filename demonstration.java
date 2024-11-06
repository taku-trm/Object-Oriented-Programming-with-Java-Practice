interface prac {
    int blue = 12;

}

class Test implements prac {
    int age = 5;
    static String name = "hdhdhhd";

    public static void display() {

        System.out.println("The code is working " + name);
    }
}

public class demonstration {
    public static void main(String[] args) {
        // Test prac = new Test();
        Test.display();
    }
}
