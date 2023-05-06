import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().trim();
        String outputStr = toggleCase(inputStr);
        System.out.println(outputStr);
    }

    public static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }

            sb.append(c);
        }

        return sb.toString();
    }
}