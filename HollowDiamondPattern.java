import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != 1) {
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != 1) {
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
