public class StarPatren {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i + 3; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= i + 3; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
