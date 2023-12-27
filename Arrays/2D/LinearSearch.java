import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int col = -1;
        int row = -1;
        int result = -1;
        System.out.println("----Array Value----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the value at row " + i + " and " + j + " column : ");
                arr[i][j] = value.nextInt();
            }
        }
        System.out.println("<-----------Searching---------->");
        System.out.print("Enter number to search : ");
        int searchNum = value.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchNum) {
                    result = 1;
                    row = i;
                    col = j;
                }
            }
        }
        if (result == 1) {
            System.out.println("The number found at row " + row + " column " + col + ".");

        } else {
            System.out.println("The number not found.");
        }
        value.close();
    }
}
