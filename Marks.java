import java.util.*;

public class Marks {

    public static void main(String[] args) {
        Scanner valueIn = new Scanner(System.in);
        System.out.println("Press t to get total marks.");
        System.out.println("Press p to get percentage.");
        System.out.print("Please Chose: ");
        String choise = valueIn.next();

        int marksArray[] = null;
        int result = 0;

        switch (choise) {
            case "t":
                System.out.print("Enter total number of subjects : ");
                int subjects = valueIn.nextInt();
                marksArray = new int[subjects];
                for (int i = 0; i < subjects; i++) {
                    System.out.print("Enter the marks for subject " + (i + 1) + " : ");
                    int marks = valueIn.nextInt();
                    marksArray[i] = marks;
                    result += marksArray[i];
                }
                System.out.println("The sum of total numbers is " + result + ".");
                System.out.print("Press h to get history and q to exit : ");
                String his = valueIn.next();
                switch (his) {
                    case "h":
                        System.out.println("Given numbers are " + Arrays.toString(marksArray)); // ! To get complete
                                                                                                // array value.
                        break;
                    case "q":
                        break;
                    default:
                        System.out.println("Unknown.");
                        break;
                }
                break;

            case "p":
                System.out.print("Enter total number get by the student : ");
                int numberGetByStudent = valueIn.nextInt();
                System.out.print("Enter total number: ");
                int totalNumber = valueIn.nextInt();
                double percentage = (double) numberGetByStudent / totalNumber * 100;
                System.out.println("The persentage is " + percentage + "%.");
                break;
            default:
                System.out.println("Please provide the given argument. ");
                break;
        }
        valueIn.close();

    }
}
