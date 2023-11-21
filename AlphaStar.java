public class AlphaStar {
    public static void main(String[] args) {
        char currnetChar = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currnetChar++);

            }
            System.out.println();

        }
    }
}
