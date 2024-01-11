import java.lang.Thread;

//! Threading is use to run multiple task at once.
class basicJavaOne extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is " + i);

        }
    }
}

class basicJavaTwo extends Thread {
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("The value of j is " + j);

        }
    }
}

public class Basic {
    public static void main(String[] args) {
        basicJavaOne b1 = new basicJavaOne();
        basicJavaTwo b2 = new basicJavaTwo();

        b1.start();
        b2.start();
    }
}
