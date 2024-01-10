import java.util.Scanner;

class Term {
    private int a;
    private int b;
    private double c;
    private double d;

    // !Disable....
    // public Term(int x, int y, double n, double m) {
    // this.a = x;
    // this.b = y;
    // this.c = n;
    // this.d = m;
    // }

    public void set(int m, int n, double x, double y) {
        a = m;
        b = n;
        c = x;
        d = y;
    }

    public void show() {
        System.out.println("The value of a is " + a + ", the value of b is " + b + ", the value of c is " + c
                + " and the value of d is " + d + ".");
    }

    public void sum() {
        System.out.println("The sum of int values a and b is " + (a + b) + ".");
        System.out.println("The sum of double values c and d is " + (c + d) + ".");
    }

    public void square() {
        System.out.println("The square of a is " + a * a + ".");
        System.out.println("The square of b is " + b * b + ".");
        System.out.println("The square of c is " + c * c + ".");
        System.out.println("The square of d is " + d * d + ".");
    }

    public void check() {
        if (a % b == 0) {
            System.out.println("First number is the divisor of second number.");
        } else {
            System.out.println("First number is not the divisor of second number.");

        }
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value of first(int) number: ");
        int num1 = value.nextInt();
        System.out.print("Enter the value of second(int) number: ");
        int num2 = value.nextInt();
        System.out.print("Enter the value of third(double) number: ");
        double num3 = value.nextDouble();
        System.out.print("Enter the value of fourth(double) number: ");
        double num4 = value.nextDouble();
        Term t = new Term();
        t.set(num1, num2, num3, num4);
        t.show();
        t.sum();
        t.square();
        t.check();

        value.close();
    }
}