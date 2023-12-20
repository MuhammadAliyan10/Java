import java.util.*;

public class Choice {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter e to check even/odd.");
        System.out.println("Enter s to get square of the number.");
        System.out.println("Enter p to print a pattern.");
        System.out.println("Enter c to use calculator.");
        System.out.println("Enter d to print day in a week.");
        System.out.print("Enter a character : ");
        char choice = value.next().charAt(0);
        switch (choice) {
            case 'e':
                System.out.print("Enter a number to check even/odd : ");
                int number = value.nextInt();
                EvenOdd evenOdd = new EvenOdd();
                evenOdd.set(number);
                evenOdd.evenOddFinder();
                break;
            case 's':
                System.out.print("Enter a number to get square : ");
                int numberSquare = value.nextInt();
                Square square = new Square();
                square.set(numberSquare);
                square.squareFinder();
                break;
            case 'c':
                System.out.print("Enter first number : ");
                int num1 = value.nextInt();
                System.out.print("Enter second number : ");
                int num2 = value.nextInt();
                System.out.print("Chose the opreator : ");
                char opr = value.next().charAt(0);
                Calculator cal = new Calculator();
                cal.set(opr, num1, num2);
                cal.calOut();
                break;
            case 'p':
                Pattern pat = new Pattern();
                pat.pattern();
                break;
            case 'd':
                System.out.print("Enter the day number : ");
                int num = value.nextInt();
                DayInWeek dayInWeek = new DayInWeek();
                dayInWeek.set(num);
                dayInWeek.dayInAWeek();
                break;
            default:
                System.out.println("Please enter a valid character.");
                break;
        }
        value.close();
    }
}

// ! Even and odd
class EvenOdd {
    private int number;

    public void set(int num) {
        number = num;
    }

    public void evenOddFinder() {
        if (number % 2 == 0) {
            System.out.println("The given number is even.");
        } else {
            System.out.println("The given number is odd.");
        }
    }
}

// !Square
class Square {
    private int number;

    public void set(int num) {
        number = num;
    }

    public void squareFinder() {
        System.out.println("The square of the " + number + " is " + (number * number) + ".");
    }
}

// ! Calculator

class Calculator {
    private char opr;
    private int num1;
    private int num2;

    public void set(char op, int nu1, int nu2) {
        opr = op;
        num1 = nu1;
        num2 = nu2;
    }

    public void calOut() {
        switch (opr) {
            case '+':
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + ".");
                break;
            case '-':
                System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2) + ".");
                break;
            case '*':
                System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2) + ".");
                break;
            case '/':
                System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2) + ".");
                break;

            default:
                System.out.println("Please enter a valid operator.");
                break;
        }

    }
}

// !Pattern

class Pattern {
    public void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || j == 5 || i == 5) {
                    System.out.print("*");

                } else if (i == 3 && j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// ! Day in a week

class DayInWeek {
    private int num;

    public void set(int nu) {
        num = nu;
    }

    public void dayInAWeek() {
        switch (num) {
            case 1:
                System.out.println("The day is Monday.");
                break;
            case 2:
                System.out.println("The day is Tuesday.");
                break;
            case 3:
                System.out.println("The day is Wednesday.");
                break;
            case 4:
                System.out.println("The day is Thrursday.");
                break;
            case 5:
                System.out.println("The day is Friday.");
                break;
            case 6:
                System.out.println("The day is Saturday.");
                break;
            case 7:
                System.out.println("The day is Sunday.");
                break;

            default:
                System.out.println("Please enter a valid number.");
                break;
        }
    }
}