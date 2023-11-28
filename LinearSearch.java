public class LinearSearch {
    public static void main(String[] args) {
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
}
