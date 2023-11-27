import java.util.*;

public class ArrOpr {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        // ! Array
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int result[] = new int[5];
        // ! First Array
        System.out.println("---First Array---");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the value in " + i + " index : ");
            arr1[i] = value.nextInt();
        }
        // ! Second Array
        System.out.println("---Second Array---");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the value in " + i + " index : ");
            arr2[i] = value.nextInt();
        }
        // !Result
        System.out.print("Please chose the opreater :  ");
        char opr = value.next().charAt(0);
        switch (opr) {
            case '+':
                for (int i = 0; i < result.length; i++) {
                    result[i] = arr1[i] + arr2[i];
                }
                break;
            case '-':
                for (int i = 0; i < result.length; i++) {
                    result[i] = arr1[i] - arr2[i];
                }
                break;
            case '*':
                for (int i = 0; i < result.length; i++) {
                    result[i] = arr1[i] * arr2[i];
                }
                break;
            case '/':
                for (int i = 0; i < result.length; i++) {
                    result[i] = arr1[i] / arr2[i];
                }
                break;

            default:
                System.out.println("Please enter a valid operater.");
                break;
        }
        // ! Result show
        System.out.print("Enter a to see the result in array or Enter l to see the result in list : ");
        char output = value.next().charAt(0);
        switch (output) {
            case 'a':
                System.out.println(Arrays.toString(result));
                break;
            case 'l':
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i]);
                }
                break;
            default:
                System.out.println("Please enter a valid character");
                break;
        }
        value.close();
    }
}
