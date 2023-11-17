import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a, b, result; // ! Variable Declaration
        System.out.print("Enter first number: ");
        a = value.nextInt(); // ! First input
        System.out.print("Enter second number: ");
        b = value.nextInt(); // !Second input
        result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + result + ".");
        value.close();

    }

}
