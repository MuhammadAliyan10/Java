import java.util.*;

public class UserInputStar {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int numOfRow = value.nextInt();
        for (int i = 1; i <= numOfRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        value.close();
    }
}
