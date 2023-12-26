import java.util.Scanner;

class Draw {
    protected int height, width;

    public void Area(int x, int y) {
        height = x;
        width = y;
    }
}

class Triangle extends Draw {
    public void Area(int x, int y) {
        height = x;
        width = y;
        System.out.println("The area of the triangle is " + (height * width) + ".");

    }
}

class Rectangle extends Draw {
    public void Area(int x, int y) {
        height = x;
        width = y;
        System.out.println("The area of the rectangle is " + (height * width / 2) + ".");
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value of Height : ");
        int height = value.nextInt();
        System.out.print("Enter the value of Width : ");
        int width = value.nextInt();
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();
        tri.Area(height, width);
        rec.Area(height, width);
        value.close();
    }
}