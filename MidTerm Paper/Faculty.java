import java.util.Scanner;

class Coumity {
    private int totalCreditHours = 312;
    private String post;

    public void set(String p) {
        post = p;
    }

    public void setCreditHours() {
        if (post == "head") {
            totalCreditHours = totalCreditHours - 45;
        } else if (post == "docter") {
            totalCreditHours = totalCreditHours - 36;
        } else if (post == "lecturer") {
            totalCreditHours = totalCreditHours - 255;

        }
    }

    public void check() {
        if (totalCreditHours < 312) {
            System.out.println("The credit hours are not distributed correctly.");

        } else {
            System.out.println("The credit hours are distributed correctly.");

        }
    }
}

public class Faculty {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        Coumity c = new Coumity();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your post: ");
            String post = value.next();
            c.set(post);
            switch (post) {
                case "head":
                    System.out.println("9 credit hours assigned for each TMdodoO,THA,THL,THI heads.");
                    c.setCreditHours();
                    break;
                case "docter":
                    System.out.println("4 credit hours assigned for each TMO,THA,THL,THI docters.");

                    c.setCreditHours();
                    break;
                case "lecturer":
                    System.out.println("15 credit hours assigned for each TMO,THA,THL,THI lecturers.");
                    c.setCreditHours();
                    break;

                default:
                    System.out.println("Invalid post.");
                    break;
            }

        }
        c.check();
        value.close();

    }
}
