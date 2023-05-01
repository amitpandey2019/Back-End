import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().trim();
        char maxChar = getMaxFreqChar(inputStr);
        System.out.println(maxChar);
    }

    public static char getMaxFreqChar(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        char maxChar = s.charAt(0);

        // count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freq = freqMap.getOrDefault(c, 0) + 1;
            freqMap.put(c, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = c;
            }
        }

        return maxChar;
    }
}

