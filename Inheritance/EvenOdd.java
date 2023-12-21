import java.util.*;

class ED {
    public void evenOddFinder(int x) {
        if (x % 2 == 0) {
            System.out.println("The given number " + x + " is even.");

        } else {
            System.out.println("The given number " + x + " is odd.");
        }
    }

}

class singleLevelInheritance extends ED {
    protected int num;

    public void set(int a) {
        num = a;
    }

}

public class EvenOdd {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = value.nextInt();
        singleLevelInheritance sLI = new singleLevelInheritance();
        sLI.set(num);
        sLI.evenOddFinder(num);
        value.close();

    }

}