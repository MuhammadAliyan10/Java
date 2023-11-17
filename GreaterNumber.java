import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = value.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = value.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = value.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first number " + firstNumber + " is greater then " + secondNumber
                    + " and third number " + thirdNumber + ".");

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {

            System.out.println("The second number " + secondNumber + " is greater then " + firstNumber
                    + " and " + thirdNumber + ".");
        } else {
            System.out.println("The third number is greater " + thirdNumber + ".");
        }
        value.close();

    }
}
