import java.util.Scanner;

public class PosNeg {
    public static String posNeg(int x) {
        if (x < 0) {
            return "The number " + x + " is negative.";

        } else {
            return "The number " + x + " is positive.";
        }

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a nummber : ");
        int number = value.nextInt();
        System.out.println(posNeg(number));
        value.close();

    }
}
