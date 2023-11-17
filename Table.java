import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter number to print the table : ");

        if (value.hasNextInt()) {
            int number = value.nextInt();
            for (int i = 1; i <= 10; i++) {
                int result = i * number;
                System.out.println(number + " * " + i + " = " + result);
            }

        } else {
            System.out.println("Please provide int value.");
        }
        value.close();
    }

}
