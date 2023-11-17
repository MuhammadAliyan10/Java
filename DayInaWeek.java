import java.util.Scanner;

public class DayInaWeek {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the day number : ");
        int dayNumber = value.nextInt();

        switch (dayNumber) {
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
                System.out.println("The day is Thursday.");
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
                System.out.println("Provide a valid date.");
                break;
        }
        value.close();
    }

}
