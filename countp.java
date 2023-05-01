import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().trim();
        System.out.println(countPalindromes(inputStr));
    }

    public static int countPalindromes(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // odd-length palindromes centered at i
            int j = 0;
            while (i-j >= 0 && i+j < n && s.charAt(i-j) == s.charAt(i+j)) {
                count++;
                j++;
            }
            // even-length palindromes centered at i
            j = 0;
            while (i-j >= 0 && i+j+1 < n && s.charAt(i-j) == s.charAt(i+j+1)) {
                count++;
                j++;
            }
        }
        return count;
    }
}
