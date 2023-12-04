import java.util.*;

public class Table {
    public static void table(int value, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(value + " x " + i + " = " + (value * i));
        }
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number you want to print : ");
        int num = value.nextInt();
        System.out.print("Enter the range of the table : ");
        int range = value.nextInt();
        table(num, range);
        value.close();
    }
}
