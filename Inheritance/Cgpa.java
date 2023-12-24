import java.util.Scanner;

class GPA {
    public double calculateGradePoint(int marks) {
        if (marks >= 85) {
            return 4.00;
        } else if (marks >= 80 && marks <= 84) {
            return 3.75;
        } else if (marks >= 75 && marks <= 79) {
            return 3.50;
        } else if (marks >= 74 && marks <= 70) {
            return 3.00;
        } else if (marks >= 65 && marks <= 69) {
            return 2.50;
        } else if (marks >= 64 && marks <= 60) {
            return 2.00;
        } else if (marks >= 55 && marks <= 59) {
            return 1.50;
        } else if (marks >= 54 && marks <= 50) {
            return 1.00;
        } else {
            return 0.0;
        }
    }

}

class Smester1 extends GPA {
    private int rollNumber;
    private int totalSubjects;
    private int[] creditHours;
    private int[] subjectsMarks;

    public void set(int tS, int cH[], int sM[], int rN) {
        totalSubjects = tS;
        creditHours = cH;
        rollNumber = rN;
        subjectsMarks = sM;
    }

    public int creditHourReturn(int creditHour[]) {
        int totalCreditHour = 0;
        for (int i = 0; i < creditHour.length; i++) {
            totalCreditHour = creditHour[i] + totalCreditHour;

        }
        return totalCreditHour;

    }

    public double gpa() {
        double totalGradePoints = 0;
        int totalCreditHours = 0;
        for (int i = 0; i < totalSubjects; i++) {
            double gradePoint = calculateGradePoint(subjectsMarks[i]);
            totalGradePoints += gradePoint * creditHours[i];
            totalCreditHours += creditHours[i];
        }
        double GPA = totalGradePoints / totalCreditHours;
        System.out.println("The GPA of BCS072230" + rollNumber + " is " + GPA + " .");
        return GPA;
    }
}

class Smester2 extends Smester1 {

    public void cgpaFinder(double s1Gpa, int s1Ch, int s2Ch, double s2Gpa, int rollNumber) {
        double totalGradePoint = (s1Gpa * s1Ch) + (s2Gpa * s2Ch);
        int totalCreditHours = s1Ch + s2Ch;
        double CGPA = totalGradePoint / totalCreditHours;
        System.out.println("The CGPA of BCS0722301" + rollNumber + " is " + CGPA + " .");

    }

}

class Smester3 extends Smester2 {

    public void cgpaFinder3(double s1Gpa, int s1Ch, int s2Ch, double s2Gpa, double s3Gpa, int s3Ch, int rollNumber) {
        double totalGradePoint = (s1Gpa * s1Ch) + (s2Gpa * s2Ch) + (s3Gpa * s3Ch);
        int totalCreditHours = s1Ch + s2Ch + s3Ch;
        double CGPA = totalGradePoint / totalCreditHours;
        System.out.println("The CGPA of BCS072230" + rollNumber + " is " + CGPA + " .");
    }
}

public class Cgpa {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter 1 to get GPA of first semester : ");
        System.out.println("Enter 2 to get GPA and CGPA of second semester : ");
        System.out.println("Enter 3 to get GPA and CGPA of third semester : ");
        System.out.print("Your choice : ");
        char opt = value.next().charAt(0);
        switch (opt) {
            case '1':
                int subjectsMarks[] = new int[10];
                int creditHours[] = new int[10];
                System.out.print("Enter your roll number : ");
                int rollNumber = value.nextInt();
                System.out.print("Enter the total numbers of subjects : ");
                int totalSubjects = value.nextInt();
                for (int i = 1; i <= totalSubjects; i++) {
                    System.out.print("Enter the number of subject " + i + " : ");
                    subjectsMarks[i] = value.nextInt();
                    System.out.print("Enter the credit hour for subject " + i + " : ");
                    creditHours[i] = value.nextInt();
                }
                Smester1 s1 = new Smester1();
                s1.set(totalSubjects, creditHours, subjectsMarks, rollNumber);
                s1.gpa();
                break;
            case '2':
                int subjectsMarks2[] = new int[10];
                int creditHours2[] = new int[10];
                System.out.print("Enter your roll number : ");
                int rollNumber2 = value.nextInt();
                System.out.print("Enter total numbers of subjects : ");
                int totalSubjects2 = value.nextInt();
                for (int i = 1; i <= totalSubjects2; i++) {
                    System.out.print("Enter the number of subject " + i + " : ");
                    subjectsMarks2[i] = value.nextInt();
                    System.out.print("Enter the credit hour for subject " + i + " : ");
                    creditHours2[i] = value.nextInt();
                }
                Smester2 s2 = new Smester2();
                s2.set(totalSubjects2, creditHours2, subjectsMarks2, rollNumber2);
                System.out.println("Press g to get GPA.");
                System.out.println("Press c to get CGPA.");
                System.out.print("Enter your choice : ");
                char option = value.next().charAt(0);
                switch (option) {
                    case 'g':
                        s2.gpa();
                        break;
                    case 'c':
                        System.out.print("Enter the GPA of first smester : ");
                        double s1gp = value.nextDouble();
                        System.out.print("Enter credit hour of first smester : ");
                        int s1ch = value.nextInt();
                        int s2ch = s2.creditHourReturn(creditHours2);
                        double s2gp = s2.gpa();
                        s2.cgpaFinder(s1gp, s1ch, s2ch, s2gp, rollNumber2);
                        break;
                    default:
                        System.out.println("Please enter a valid character.");
                        break;
                }
                break;
            case '3':
                int subjectsMarks3[] = new int[10];
                int creditHours3[] = new int[10];
                System.out.print("Enter your roll number : ");
                int rollNumber3 = value.nextInt();
                System.out.print("Enter the total numbers of subjects : ");
                int totalSubjects3 = value.nextInt();
                for (int i = 1; i <= totalSubjects3; i++) {
                    System.out.print("Enter the number of subject " + i + " : ");
                    subjectsMarks3[i] = value.nextInt();
                    System.out.print("Enter the credit hour for subject " + i + " : ");
                    creditHours3[i] = value.nextInt();
                }
                Smester3 s3 = new Smester3();
                s3.set(totalSubjects3, creditHours3, subjectsMarks3, rollNumber3);
                System.out.println("Press g to get GPA.");
                System.out.println("Press c to get CGPA.");
                System.out.print("Enter your choice : ");
                char options = value.next().charAt(0);
                switch (options) {
                    case 'g':
                        s3.gpa();
                        break;
                    case 'c':
                        System.out.print("Enter the GPA of first smester : ");
                        double s1gp = value.nextDouble();
                        System.out.print("Enter credit hour of first smester : ");
                        int s1ch = value.nextInt();
                        System.out.print("Enter the GPA of second smester : ");
                        double s2gp = value.nextDouble();
                        System.out.print("Enter credit hour of second smester : ");
                        int s2ch = value.nextInt();
                        int s3ch = s3.creditHourReturn(creditHours3);
                        double s3gp = s3.gpa();
                        s3.cgpaFinder3(s1gp, s1ch, s2ch, s2gp, s3gp, s3ch, rollNumber3);
                        break;
                    default:
                        System.out.println("Please enter a valid character.");
                        break;
                }
                break;
            default:
                System.out.println("Please enter a valid character.");
                break;
        }
        value.close();
    }
}
