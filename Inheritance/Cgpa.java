import java.util.Scanner;

class GPACalculator {
    public double calculateGradePoint(int marks) {
        if (marks >= 90) {
            return 4.0;
        } else if (marks >= 80) {
            return 3.0;
        } else if (marks >= 70) {
            return 2.0;
        } else if (marks >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}

class Smester1 extends GPACalculator {
    int creditHours[] = new int[7];
    int subjectsMarks[] = new int[7];
    Scanner value = new Scanner(System.in);

    public void Cgpa() {
        System.out.print("Enter your roll number : ");
        int rollNumber = value.nextInt();
        for (int i = 1; i < subjectsMarks.length; i++) {
            System.out.print("Enter number of subject " + i + " : ");
            subjectsMarks[i] = value.nextInt();
            System.out.print("Enter credit hour for subject " + i + " : ");
            creditHours[i] = value.nextInt();
        }
        double totalGradePoints = 0;
        int totalCreditHours = 0;
        for (int i = 0; i < subjectsMarks.length; i++) {
            double gradePoint = calculateGradePoint(subjectsMarks[i]);
            totalGradePoints += gradePoint * creditHours[i];
            totalCreditHours += creditHours[i];
        }

        double GPA = totalGradePoints / totalCreditHours;

        System.out.println("The GPA of BCS072230" + rollNumber + " is " + GPA + " .");

    }

}

public class Cgpa {

    public static void main(String[] args) {
        Smester1 s1 = new Smester1();
        s1.Cgpa();
    }
}