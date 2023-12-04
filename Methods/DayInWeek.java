import java.util.*;

public class DayInWeek {
    public static void days(int x) {
        switch (x) {
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
                System.out.println("The day is Thrusday.");
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
                System.out.println("Invalid date format.");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter date format in number : ");
        int num = value.nextInt();
        days(num);
        value.close();

    }
}
