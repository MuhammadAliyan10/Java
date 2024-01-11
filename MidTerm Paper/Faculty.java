import java.util.Scanner;

class AssignCreditHours {
    public int totalCreditHours = 312;
    private String post;
    private int result = 0;
    private int finalCreditHours[] = new int[27];
    private int docterCreditHours[] = new int[3];
    private int lecturerCreditHours[] = new int[21];

    public void set(String p, int dch[], int lch[]) {
        docterCreditHours = dch;
        lecturerCreditHours = lch;
        post = p;

    }

    public void giveCreditHours() {
        if (post.equals("head")) {
            finalCreditHours[0] = 9;
        } else if (post.equals("docter")) {
            for (int i = 0; i < 3; i++) {
                finalCreditHours[i + 1] = docterCreditHours[i];
            }
        } else if (post.equals("lecturer")) {
            for (int j = 0; j < 21; j++) {
                finalCreditHours[j + 6] = lecturerCreditHours[j];
            }
        }
    }

    public int returnFinalCreditHours() {
        for (int i = 0; i <= 26; i++) {
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
        for (int l = 0; l <= 3; l++) {
            System.out.println("Enter check to get final result.");
            System.out.print("Enter your post : ");
            String post = value.next();
            int lch[] = new int[21];
            int dch[] = new int[3];
            ach.set(post, dch, lch);
            switch (post) {
                case "head":
                    System.out.println("Credit hour assigned to post head.");
                    ach.giveCreditHours();
                    break;
                case "docter":
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Give the value to the docter " + (i + 1) + ": ");
                        dch[i] = value.nextInt();

                    }
                    ach.giveCreditHours();
                    break;
                case "lecturer":
                    ach.giveCreditHours();
                    for (int i = 0; i < 21; i++) {
                        System.out.print("Give credit hour to lecturer " + (i + 1) + ": ");
                        lch[i] = value.nextInt();
                    }
                    break;
                case "check":
                    ach.finalResult();

                    break;
                default:
                    System.out.println("Only post available is head,docter and lecturer.");
                    break;
            }
        }

        value.close();
    }

}
