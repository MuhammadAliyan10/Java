import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner value = new Scanner(System.in);
        int guess = 0;
        System.out.print("Enter a number between 1 and 100 : ");
        if (value.hasNextInt()) {
            while (true) {
                int userNumber = value.nextInt();
                if (randomNumber == userNumber) {
                    guess++;
                    System.out.println("Congratulation, You won the game in " + guess + ".");
                    break;

                } else if (userNumber < randomNumber) {
                    System.out.print("The provided number is less. Try larger one : ");
                    guess++;

                } else if (userNumber > randomNumber) {
                    System.out.print("The provided number is greater. Try smaller one : ");
                    guess++;

                }

            }
        } else {
            System.out.println("Please provide a number.");
        }
        value.close();

    }
}
