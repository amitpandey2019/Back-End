import java.util.Scanner;

public class Rhoumbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        // Print upper half of the pattern
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= (N - i) * 2; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in increasing order
            for (int j = i; j <= i + (i - 1); j++) {
                System.out.print(j + "\t");
            }
            
            // Print numbers in decreasing order
            for (int j = i + (i - 1) - 1; j >= i; j--) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
        }
        
        // Print lower half of the pattern
        for (int i = N - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= (N - i) * 2; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in increasing order
            for (int j = i; j <= i + (i - 1); j++) {
                System.out.print(j + "\t");
            }
            
            // Print numbers in decreasing order
            for (int j = i + (i - 1) - 1; j >= i; j--) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
        }
    }
}
