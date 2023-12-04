import java.util.Scanner;

public class EvenOdd {
    public static String evenOdd(int x) {
        if (x % 2 == 0) {
            return "The number is even.";

        } else {
            return "The number is odd.";
        }

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = value.nextInt();
        System.out.println(evenOdd(number));
        value.close();

    }
}
