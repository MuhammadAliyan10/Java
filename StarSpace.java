public class StarSpace {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
            } else if (i % 2 == 0) {
                for (int k = 1; k <= 5; k++) {
                    if (k == 3) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (int l = 1; l <= 5; l++) {
                    if (l % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
