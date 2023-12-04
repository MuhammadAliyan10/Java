import java.util.*;

public class Calculator {
    public static void calculate(int x, int y, char opr) {
        switch (opr) {
            case '+':
                System.out.println("The sum of the " + x + " and " + y + " is " + (x + y) + " .");
                break;
            case '-':
                System.out.println("The substraction of the " + x + " and " + y + " is " + (x - y) + " .");
                break;
            case '*':
                System.out.println("The muliplication of the " + x + " and " + y + " is " + (x * y) + " .");
                break;
            case '/':
                System.out.println("The dividence of the " + x + " and " + y + " is " + (x / y) + " .");
                break;

            default:
                System.out.println("Invalid operater.");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = value.nextInt();
        System.out.print("Enter second number :");
        int num2 = value.nextInt();
        System.out.print("Enter opreator(+,-,*,/) :");
        char opr = value.next().charAt(0);
        calculate(num1, num2, opr);
        value.close();

    }
}
