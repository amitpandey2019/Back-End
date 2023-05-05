 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().trim();
        String outputStr = insertAsciiDiff(inputStr);
        System.out.println(outputStr);
    }

    public static String insertAsciiDiff(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            int diff = (int) c2 - (int) c1;

            sb.append(c1);
            sb.append(diff);
        }

        sb.append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
 {
    
}
