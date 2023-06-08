import java.util.Scanner;

public class Patarn{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
