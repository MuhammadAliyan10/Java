import java.util.*;

public class Grade {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = value.next();
        System.out.print("Enter your roll Number : ");
        int rollNumber = value.nextInt();
        System.out.print("Enter your mid Marks : ");
        int midMarks = value.nextInt();
        System.out.print("Enter your final Marks : ");
        int finalMarks = value.nextInt();
        System.out.print("Enter the total Marks : ");
        int totalNumber = value.nextInt();

        Student student = new Student(name, rollNumber, midMarks, finalMarks, totalNumber);
        System.out.println("The name of the student is " + student.getName() + ".");
        System.out.println("The roll number of the student is BCS072230" + student.rollNumber() + ".");
        System.out.println("The mid marks of the student is " + student.midMarks() + ".");
        System.out.println("The final marks of the student is " + student.finalMarks() + ".");
        System.out.println("The student get the " + student.gradeFinder() + " grade.");

        value.close();
    }
}

class Student {
    private String name;
    private int midMarks;
    private int finalMarks;
    private int rollNumber;
    private int totalNumber;

    public Student(String name, int rollNumber, int midMarks, int finalMarks, int totalNumber) {
        this.name = name;
        this.midMarks = midMarks;
        this.rollNumber = rollNumber;
        this.finalMarks = finalMarks;
        this.totalNumber = totalNumber;
    }

    public String getName() {
        return name;
    }

    public int midMarks() {
        return midMarks;
    }

    public int rollNumber() {
        return rollNumber;
    }

    public int totalNumber() {
        return totalNumber;
    }

    public int finalMarks() {
        return finalMarks;
    }

    public String gradeFinder() {
        // Use double to ensure accurate division
        double averageNumber = ((midMarks + finalMarks) / (double) totalNumber) * 100;
        if (averageNumber >= 90) {
            return "A";
        } else if (averageNumber >= 80) {
            return "B";
        } else if (averageNumber >= 70) {
            return "C";
        } else if (averageNumber >= 60) {
            return "D";
        } else if (averageNumber >= 50) {
            return "E";
        } else {
            return "Fail";
        }
    }
}
