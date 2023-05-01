public import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().trim();
        String outputStr = replaceChars(inputStr);
        System.out.println(outputStr);
    }

    public static String replaceChars(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i % 2 == 0) {
                c = (char) (c + 1);
            } else {
                c = (char) (c - 1);
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
 {
    
}
