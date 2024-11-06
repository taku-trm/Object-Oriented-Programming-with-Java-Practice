import java.util.Scanner;
import java.util.InputMismatchException;

class Marks {
    public int size = 40;
    public int marksArray[] = new int[size];
    private int sum;
    private double average;
    Scanner input = new Scanner(System.in);

    public void acceptMarks() {
        for (int i = 0; i < size; i++) {
            System.out.println("enter mark " + (i + 1));
            try {

                int mark = input.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marksArray[i] = mark;
                } else {
                    System.out.println("invalid entry");
                    input.next();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value.");
                input.next();
            }
        }

    }

    public void highestLowest() {
        int highest = marksArray[0];
        int lowest = marksArray[0];
        for (int i = 0; i < size; i++) {
            if (marksArray[i] > highest) {
                highest = marksArray[i];
            }
            if (marksArray[i] < lowest) {
                lowest = marksArray[i];
            }
        }
        System.out.println("The highest mark is : " + highest);
        System.out.println("The lowest mark is : " + lowest);
    }

    public void sum() {
        for (int i = 0; i < size; i++) {
            sum += marksArray[i];
        }
        System.out.println("The sum of all marks is: " + sum);
    }

    public void average() {
        average = sum / size;
        System.out.println("The average mark is: " + average);
    }
}

public class Grades {
    public static void main(String[] args) {
        Marks marks = new Marks();
        marks.acceptMarks();
        marks.highestLowest();
        marks.sum();
        marks.average();
    }
}
