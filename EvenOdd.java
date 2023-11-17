import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter number to check whether its even or odd : ");
        int number = value.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        value.close();

    }

}
