import java.util.Scanner;

class AssignCreditHours {
    public int totalCreditHours = 312;
    private String post;
    private int result = 0;
    private int finalCreditHours[];

    public void set(String p) {
        post = p;

    }

    public void giveCreditHours(int docterCreditHours[], int lecturerCreditHours[]) {
        if (post == "head") {
            finalCreditHours[0] = 9;
        } else if (post == "docter") {
            for (int i = 0; i < 3; i++) {
                finalCreditHours[i + 1] = docterCreditHours[i];
            }
        } else if (post == "lecturer") {
            for (int j = 0; j < 21; j++) {
                finalCreditHours[j + 6] = lecturerCreditHours[j];

            }
        }
    }

    public int returnFinalCreditHours() {
        for (int i = 0; i < finalCreditHours.length; i++) {
            result = finalCreditHours[i] + result;
        }
        return result;
    }

    int finalResult = returnFinalCreditHours();

    public void finalResult() {
        if (finalResult == totalCreditHours) {
            System.out.println("All credit hours are assigned to all post memeber successfully.");

        } else {
            System.out.println("Sorry but all credit hours are not assigned according to the plan.");
        }
    }
}

public class Faculty {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        AssignCreditHours ach = new AssignCreditHours();
        System.out.print("Enter your post : ");
        String post = value.next();
        ach.set(post);
        switch (post) {
            case "head":
                ach.giveCreditHours(null, null);
                break;
            case "docter":
                int dch[] = new int[3];
                for (int i = 0; i <= dch.length; i++) {
                    System.out.print("Give the value to the docter " + i + ": ");
                    dch[i] = value.nextInt();

                }
                ach.giveCreditHours(dch, null);
                break;
            case "lecturer":
                int lch[] = new int[21];
                for (int i = 0; i <= lch.length; i++) {
                    System.out.println("Give credit hour to lecturer " + i + ": ");
                    lch[i] = value.nextInt();
                }
                ach.giveCreditHours(null, lch);
                break;
            default:
                System.out.println("Only post available is head,docter and lecturer.");
                break;
        }
        ach.finalResult();
        value.close();
    }

}
