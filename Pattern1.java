import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("0 ");
            }
            
            if (i > 1) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}