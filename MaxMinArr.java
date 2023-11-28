import java.util.*;

public class MaxMinArr {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int arr[] = new int[5];
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value in " + i + " index : ");
            arr[i] = value.nextInt();
        }
        System.out.print("Enter max to get maximum, min to get minimum or b to get both value  : ");
        String choice = value.next();
        switch (choice) {
            case "max":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("The maximum value is " + max + ".");
                break;
            case "min":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                System.out.println("The minimum value is " + min + ".");
                break;
            case "b":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                System.out.println("The maximum value is " + max + ".");
                System.out.println("The minimum value is " + min + ".");
                break;
            default:
                System.out.println("Invalid value.");
                break;
        }
        value.close();
    }
}
