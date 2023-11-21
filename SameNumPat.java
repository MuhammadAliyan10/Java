public class SameNumPat {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(num + "  ");

            }
            num++;
            System.out.println();
        }
    }

}
