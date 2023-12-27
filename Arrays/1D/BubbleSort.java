import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("<---- Length Declaration ----? ");
        System.out.print("Enter the length of the array : ");
        int len = value.nextInt();
        int[] arr = new int[len];
        int[] ass = new int[len];
        int[] des = new int[len];

        System.out.println("<---- Value in Array ---->");
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the value in " + i + " index : ");
            arr[i] = value.nextInt();
        }
        System.out.print("Enter a to insert in assending or d to insert in descending order : ");
        char choice = value.next().charAt(0);
        switch (choice) {
            case 'a':
                for (int i = len - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                    ass[i] = arr[i];
                }
                System.out.println("The order will be " + Arrays.toString(ass));
                break;
            case 'd':
                for (int i = len - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                    des[i] = arr[i];
                }
                System.out.println("The order will be " + Arrays.toString(des));
                break;

            default:
                break;
        }
        value.close();

    }
}
