import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter number to print the table : ");
        int number = value.nextInt();
        System.out.print("Enter number of limit to print the table : ");
        int limit = value.nextInt();

        for (int i = 1; i <= limit; i++) {
            int result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }

        value.close();
    }

}
