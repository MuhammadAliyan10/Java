import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a, b, c;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = value.nextInt();
        System.out.print("Enter the second number : ");
        b = value.nextInt();
        System.out.println("The value of first number is " + a + " and the second number is " + b + " before swap.");
        c = a;
        a = b;
        b = c;
        System.out.println("The value of first number is " + a + " and the second number is " + b + " after swap.");
        value.close();
    }
}
