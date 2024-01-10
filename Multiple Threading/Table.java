import java.lang.Thread;

class TableTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
            if (i == 5) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class TableThree extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (i * 3));
        }
    }
}

class TableFour extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("4 * " + i + " = " + (i * 4));
        }
    }
}

public class Table {
    public static void main(String[] args) {
        TableTwo t2 = new TableTwo();
        TableThree t3 = new TableThree();
        TableFour t4 = new TableFour();
        // !To start the function
        t2.start();
        t3.start();
        t4.start();
        // !To give priority, which funtion will run first. Range(5 to 10). Default
        // ! priority is 5
        t2.setPriority(9);
        t3.setPriority(7);
        t4.setPriority(5);
    }
}