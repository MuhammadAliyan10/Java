import java.util.Scanner;

public class PositiveNegitive {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a number to check the negative or positive: ");
        int number = value.nextInt();

        if (number >= 0) {
            System.out.println("The number is positive.");

        } else {
            System.out.println("The number is negitive.");

        }
        value.close();
    }
}
