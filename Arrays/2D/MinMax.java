import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int max = 0;
        int min = Integer.MAX_VALUE;
        int arr[][] = new int[3][3];
        System.out.println("----Array Value----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the value at row " + i + " and " + j + " column :  ");
                arr[i][j] = value.nextInt();
            }
        }
        System.out.print("Enter m to get maximum value and n to get minimum value : ");
        char cho = value.next().charAt(0);
        switch (cho) {
            case 'm':
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                        }
                    }
                }
                System.out.println("The maximum value is " + max + " .");
                break;
            case 'n':
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] < min) {
                            min = arr[i][j];
                        }
                    }
                }
                System.out.println("The minimum value is " + min + " .");
                break;
            default:
                System.out.println("Invalid choise.");
                break;
        }

        value.close();
    }
}
