import java.util.Scanner;

class Outline {
    protected int totalSubject;
    protected int creditHours;
    protected int smesterName;
    protected int creditHoursPerSubject[];

    public void smesterOutline(int sName) {
        smesterName = sName;
    }
}

class Smester1 extends Outline {
    public void smesterOutline(int sName) {
        totalSubject = 7;
        creditHours = 16;
        smesterName = sName;
        creditHoursPerSubject = new int[] { 3, 2, 3, 3, 0, 2, 3 };

        System.out.println("---- Smester " + smesterName + "st ----");
        System.out.println("Total number of subjects are " + totalSubject + ".");
        System.out.println("Total number of credit hours are " + creditHours + ".");
        System.out.println("Subjects are : ");
        for (int i = 0; i <= totalSubject; i++) {
            if (i == 0) {
                System.out.println(
                        "First subject is Applied Physics with credit hours " + creditHoursPerSubject[i] + ".");
            } else if (i == 1) {
                System.out.println("Second subject is Holy Qurran with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 2) {
                System.out.println("Third subject is English with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 3) {
                System.out.println("Fourth subject is Calculus with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 4) {
                System.out.println("Fifth subject is Islamyiat with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 5) {
                System.out
                        .println("Sixth subject is Social Studay with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 6) {
                System.out.println(
                        "Seventh subject is ICT with credit hours " + creditHoursPerSubject[i] + ".");

            }

        }

    }

}

class Smester2 extends Outline {
    public void smesterOutline(int sName) {
        totalSubject = 5;
        creditHours = 17;
        smesterName = sName;
        creditHoursPerSubject = new int[] { 3, 4, 4, 3, 3 };

        System.out.println("---- Smester " + smesterName + "nd ----");
        System.out.println("Total number of subjects are " + totalSubject + ".");
        System.out.println("Total number of credit hours are " + creditHours + ".");
        System.out.println("Subjects are : ");
        for (int i = 0; i <= totalSubject; i++) {
            if (i == 0) {
                System.out.println("First subject is Statistics with credit hours " + creditHoursPerSubject[i] + ".");
            } else if (i == 1) {
                System.out.println("Second subject is DLD with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 2) {
                System.out.println(
                        "Third subject is Programing Fundamentals with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 3) {
                System.out.println("Fourth subject is English with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 4) {
                System.out.println("Fifth subject is Marketing with credit hours " + creditHoursPerSubject[i] + ".");

            }

        }

    }

}

class Smester3 extends Outline {
    public void smesterOutline(int sName) {
        totalSubject = 6;
        creditHours = 17;
        smesterName = sName;
        creditHoursPerSubject = new int[] { 4, 0, 3, 3, 4, 3 };

        System.out.println("---- Smester " + smesterName + "rd ----");
        System.out.println("Total number of subjects are " + totalSubject + ".");
        System.out.println("Total number of credit hours are" + creditHours + ".");
        System.out.println("Subjects are : ");
        for (int i = 0; i <= totalSubject; i++) {
            if (i == 0) {
                System.out.println("First subject is OOP with credit hours " + creditHoursPerSubject[i] + ".");
            } else if (i == 1) {
                System.out.println(
                        "Second subject is Translation Holy Qurran with credit hours " + creditHoursPerSubject[i]
                                + ".");

            } else if (i == 2) {
                System.out.println("Third subject is Discrete with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 3) {
                System.out.println("Fourth subject is Calculus with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 4) {
                System.out.println("Fifth subject is C.O.A.L with credit hours " + creditHoursPerSubject[i] + ".");

            } else if (i == 5) {
                System.out.println("Sixth subject is P.P with credit hours " + creditHoursPerSubject[i] + ".");

            }

        }

    }

}

public class SmesterOutline {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter 1 to get outline of first smester.");
        System.out.println("Enter 2 to get outline of second smester.");
        System.out.println("Enter 3 to get outline of third smester.");
        System.out.print("Your choice of smester is : ");
        int choice = value.nextInt();
        // !Objects
        Smester1 s1 = new Smester1();
        Smester2 s2 = new Smester2();
        Smester3 s3 = new Smester3();
        switch (choice) {
            case 1:
                s1.smesterOutline(choice);
                break;
            case 2:
                s2.smesterOutline(choice);

                break;
            case 3:
                s3.smesterOutline(choice);

                break;

            default:
                System.out.println("Only available smester are three.");
                break;
        }
        value.close();
    }
}
