import java.util.*;

public class Pattern {
    public static void pattern(char choice) {
        switch (choice) {
            case 's':
                for (int i = 1; i <= 12; i++) {
                    for (int j = 1; j <= 18; j++) {
                        if ((i == 4 && j == 1) || (i == 4 && j == 3) || (i == 4 && j == 5) || (i == 4 && j == 7)
                                || (i == 4 && j == 9) || (i == 4 && j == 11) || (i == 4 && j == 13)
                                || (i == 4 && j == 16)
                                || (i == 4 && j == 18)) {
                            System.out.print("*");
                        } else if ((i == 1 && j == 9) || (i == 2 && j == 8) || (i == 2 && j == 10) || (i == 3 && j == 7)
                                || (i == 3 && j == 11) || (i == 5 && j == 5) || (i == 5 && j == 13)
                                || (i == 6 && j == 4)
                                || (i == 6 && j == 14) || (i == 7 && j == 3) || (i == 7 && j == 15)
                                || (i == 8 && j == 2)
                                || (i == 8 && j == 16) || (i == 9 && j == 1) || (i == 10 && j == 1)
                                || (i == 9 && j == 17)
                                || (i == 10 && j == 18) || (i == 4 && j == 3) || (i == 5 && j == 1)
                                || (i == 5 && j == 1)
                                || (i == 6 && j == 4) || (i == 7 && j == 7) || (i == 8 && j == 10)
                                || (i == 9 && j == 13)
                                || (i == 10 && j == 16) || (i == 5 && j == 17) || (i == 6 && j == 14)
                                || (i == 7 && j == 11)
                                || (i == 8 && j == 8) || (i == 9 && j == 5) || (i == 10 && j == 3)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 'f':
                for (int i = 1; i <= 11; i++) {
                    for (int j = 1; j <= 15; j++) {
                        if (i == 1 || i == 7 || j == 1) {
                            System.out.print("*");
                        } else if ((i == 2 && j == 3) || (i == 2 && j == 15) || (i == 3 && j == 3)
                                || (i == 3 && j == 15)
                                || (i == 4 && j == 3) || (i == 4 && j == 15) || (i == 2 && j == 8) || (i == 4 && j == 6)
                                || (i == 5 && j == 7) || (i == 6 && j == 8) || (i == 4 && j == 10)
                                || (i == 5 && j == 3) || (i == 5 && j == 15) || (i == 3 && j == 7) || (i == 6 && j == 3)
                                || (i == 6 && j == 15)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 't':
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i == 1 || i == 6) {
                            System.out.print("* ");
                        } else if (j == 1 || j == i) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();

                }
                break;

            case 'p':
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10 - i; j++) {
                        System.out.print(" ");
                    }

                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 'd':
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 'e':
                for (int i = 1; i <= 8; i++) {
                    for (int j = 1; j <= 8; j++) {
                        if ((i == 1 && j == 4) || (i == 2 && j == 3) || (i == 2 && j == 5) || (i == 3 && j == 2)
                                || (i == 3 && j == 6) || (i == 4 && j == 1) || (i == 4 && j == 7) || (i == 5 && j == 2)
                                || (i == 5 && j == 6) || (i == 6 && j == 3) || (i == 6 && j == 5)
                                || (i == 7 && j == 4)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 'a':
                char currnetChar = 'A';
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(currnetChar++);

                    }
                    System.out.println();

                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter f for Flag.");
        System.out.println("Enter t for Triangle.");
        System.out.println("Enter a for Character Triangle.");
        System.out.println("Enter d for Diamond.");
        System.out.println("Enter e for Empty Diamond.");
        System.out.println("Enter s for Star.");
        System.out.print("Enter your choice : ");
        char choice = value.next().charAt(0);
        pattern(choice);
        value.close();

    }

}
