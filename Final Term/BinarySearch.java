import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 3, 23, 23, 32, 33, 43, 45 };
        Arrays.sort(arr);
        int searchNumber = 43;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int center = left + (right - left) / 2;
            if (arr[center] == searchNumber) {
                System.out.println("The number is at index " + center);
                return;
            } else if (searchNumber < arr[center]) {
                right = center - 1;
            } else {
                left = center + 1;
            }
        }
        System.out.println("No matching found.");
    }
}
