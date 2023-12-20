import java.util.*;

class Task {
    private int a;
    private int b;
    private double c;
    private double d;

    public void set1(int x, int y) {
        a = x;
        b = y;
    }

    public void set2(double x, double y) {
        c = x;
        d = y;
    }

    public void show1() {
        System.out.println("The value of A is " + a + " and B is " + b + ".");
    }

    public void show2() {
        System.out.println("The value of C is " + c + " and D is " + d + ".");
    }

    public void sum1() {
        System.out.println("The sum of A and B is " + (a + b) + ".");
    }

    public void sum2() {
        System.out.println("The sum of C and D is " + (c + d) + ".");
    }

    public void totalSum() {
        System.out.println("The sum of A, B , C and D is " + (a + b + c + d) + ".");
    }

    public Task() {
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

    public Task(int x, int y) {
        a = x;
        b = y;
        System.out.println("Two parameters constructor called.");

    }

    public Task(int x, int y, double a, double b) {
        System.out.println("Four parameters constructor called.");
        a = x;
        b = y;
        c = a;
        d = b;
        System.out.println("The sum of four variables is " + (a + b + c + d));
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int num1 = value.nextInt();
        System.out.print("Enter the value of B : ");
        int num2 = value.nextInt();
        System.out.print("Enter the value of C : ");
        double num3 = value.nextDouble();
        System.out.print("Enter the value of D : ");
        double num4 = value.nextDouble();

        Task task1 = new Task();
        Task task2 = new Task(num1, num2);
        Task task3 = new Task(num1, num2, num3, num4);
        task2.set2(num3, num4);
        task2.show2();
        task2.sum2();
        task1.set1(num1, num2);
        task1.show1();
        task1.sum1();
        value.close();
    }
}