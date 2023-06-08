import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int mid = N / 2 + 1;
        int spaceCount = mid - 1;
        int starCount = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= starCount; k++) {
                System.out.print("* ");
            }

            System.out.println();

            if (i < mid) {
                spaceCount--;
                starCount += 2;
            } else {
                spaceCount++;
                starCount -= 2;
            }
        }
    }
}
