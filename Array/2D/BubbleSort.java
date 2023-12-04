import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int temp;

        System.out.println("----Array Value----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the value at " + i + " row " + j + " column : ");
                arr[i][j] = value.nextInt();
            }

        }
        System.out.print("Enter a to sort assending or d to sort by descending order : ");
        char cho = value.next().charAt(0);
        switch (cho) {
            case 'a':
                System.out.println("Before sorting : ");
                System.out.println(Arrays.deepToString(arr));
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length - 1; j++) {
                        for (int k = 0; k < arr[i].length - j - 1; k++) {
                            if (arr[i][k] > arr[i][k + 1]) {
                                temp = arr[i][k];
                                arr[i][k] = arr[i][k + 1];
                                arr[i][k + 1] = temp;
                            }
                        }
                    }
                }
                System.out.println("After sorting : ");
                System.out.println(Arrays.deepToString(arr));

                break;
            case 'd':
                System.out.println("Before sorting : ");
                System.out.println(Arrays.deepToString(arr));
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length - 1; j++) {
                        for (int k = 0; k < arr[i].length - j - 1; k++) {
                            if (arr[i][k] < arr[i][k + 1]) {
                                temp = arr[i][k];
                                arr[i][k] = arr[i][k + 1];
                                arr[i][k + 1] = temp;
                            }
                        }
                    }
                }
                System.out.println("After sorting : ");
                System.out.println(Arrays.deepToString(arr));

                break;

            default:
                System.out.println("Invalid operation.");
                break;
        }
        value.close();

    }

}
