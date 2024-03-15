import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[][] = { { 3, 42, 1 }, { 5, 4, 3 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }

            }

        }
        System.out.println("After sorting" + Arrays.deepToString(arr));
    }
}
