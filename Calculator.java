import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter first value: ");// !This is the output of first number.
        int num1 = value.nextInt();// !This is the input of first number.
        System.out.print("Enter second value: ");// !This is the output of second number.
        int num2 = value.nextInt();// !This is the input of second number.
        System.out.print("Chose opreator(+,-,/,*): ");// !This is the output of first number.
        String opreator = value.next();// !This is the input of opreator.
        int result = 0;

        switch (opreator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) { // ! This will check the first number is non-zero or not.
                    result = num1 / num2;
                } else {
                    System.out.println("Math error.");
                }
                break;
            default:
                System.out.println("Please chose the correct opreator.");
                break;
        }
        System.out.println("The result is " + result + ".");
        value.close(); // ! It is a good practic to close the Scanner after using it.
    }
}