 import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int start = 1;
        int end = N;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 2 * N - 1; j++) {
                if (j >= N + 1 - i && j <= N - 1 + i) {
                    System.out.print(start + "\t");
                    if (j < N) {
                        start++;
                    } else {
                        start--;
                    }
                } else {
                    System.out.print("\t");
                }
            }
            start = i + 1;
            System.out.println();
        }
    }
}
 
    

