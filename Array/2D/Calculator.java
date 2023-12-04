import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int arr1[][] = new int[2][3];
        int arr2[][] = new int[2][3];
        int result[][] = new int[2][3];
        Scanner value = new Scanner(System.in);

        System.out.println("----First Array----");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("Enter the value at " + i + " row " + j + " column : ");
                arr1[i][j] = value.nextInt();

            }

        }
        System.out.println("----Second Array----");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("Enter the value at " + i + " row " + j + " column : ");
                arr2[i][j] = value.nextInt();

            }

        }
        System.out.print("Enter the opreator(+,-,*,/) : ");
        char opr = value.next().charAt(0);
        switch (opr) {
            case '+':
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        result[i][j] = arr1[i][j] + arr2[i][j];

                    }

                }
                System.out.println(Arrays.deepToString(result));

                break;
            case '-':
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        result[i][j] = arr1[i][j] - arr2[i][j];

                    }

                }
                System.out.println(Arrays.deepToString(result));

                break;
            case '*':
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        result[i][j] = arr1[i][j] * arr2[i][j];

                    }

                }
                System.out.println(Arrays.deepToString(result));

                break;
            case '/':
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        result[i][j] = arr1[i][j] / arr2[i][j];

                    }

                }
                System.out.println(Arrays.deepToString(result));

                break;

            default:
                break;
        }
        value.close();

    }
}