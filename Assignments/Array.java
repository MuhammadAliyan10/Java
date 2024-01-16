import java.util.*;

public class Array {
    public static void bubbleSort1D() {
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

    public static void linearSearch1D() {
        int arr[] = { 7, 75, 60, 55, 80, 85 };
        int value = -1;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 80) {
                value = 1;
                result = i;
            }
        }
        if (value == 1) {
            System.out.println("The number is at index of " + result + ".");

        } else {
            System.out.println("Number not found.");

        }
    }

    public static void linearSearch2D() {
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

    public static void bubbleSort2D() {
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

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter 1 to do methods on 1D array.");
        System.out.println("Enter 2 to do methods on 2D array.");
        System.out.print("Your Choice : ");
        int choice = value.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter s to do sorting.");
                System.out.println("Enter l to do searching.");
                System.out.print("Your Choice : ");
                char ch = value.next().charAt(0);
                switch (ch) {
                    case 'l':
                        linearSearch1D();
                        break;
                    case 's':
                        bubbleSort1D();
                        break;

                    default:
                        System.out.println("Only sorting and linear searching is supported.");
                        break;
                }
                break;
            case 2:
                System.out.println("Enter s to do sorting.");
                System.out.println("Enter l to do searching.");
                System.out.print("Your Choice : ");
                char cho = value.next().charAt(0);
                switch (cho) {
                    case 'l':
                        linearSearch2D();
                        break;
                    case 's':
                        bubbleSort2D();
                        break;

                    default:
                        System.out.println("Only sorting and linear searching is supported.");
                        break;
                }
                break;
            default:
                System.out.println("Only 1 and 2D arrays are allowed.");
                break;
        }
        value.close();
    }
}