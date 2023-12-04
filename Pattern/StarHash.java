public class StarHash {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("#");
                }

            } else {
                for (int k = 1; k <= 5; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
