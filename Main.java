import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            if (i == 1 || i == N) {
                for (int k = 1; k <= N; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k <= N - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}