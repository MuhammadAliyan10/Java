import java.util.Scanner;

public class Fee {
    public static void main(String[] args) {
        int totalStudent, feePerStudent, totalFee;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter total number of student in the class : ");
        totalStudent = value.nextInt();
        System.out.print("Enter the amonut of fee per student : ");
        feePerStudent = value.nextInt();
        totalFee = feePerStudent * totalStudent;
        System.out.println("The total amount of fee collected form " + totalStudent + " students is " + totalFee + ".");
        value.close();

    }

}
