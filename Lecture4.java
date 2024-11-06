class Fruit {
    // this is and
    String name;

    public void rot() {
        int days = 1;
        for (int i = 0; i < 7; i++) {
            if (i < 4) {
                System.out.println("I am still fresh");
            } else if (i <= 5 && i < 7) {
                System.out.println("I need to consumed before i go bad");
            } else {
                System.out.println("I am rotten");
            }
        }
    }

}

class Vegetables extends Fruit {

}

public class Lecture4 {
    public static void main(String[] args) {
        Fruit fruits = new Fruit();
        Vegetables veg = new Vegetables();

        fruits.rot();

    }
}
