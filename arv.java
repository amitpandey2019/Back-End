public import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt(); // read in the first number
    
    // read in the rest of the numbers
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }
    
    // find the maximum number in the array
    int max = nums[0];
    for (int i = 1; i < n; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    
    // print out the maximum number
    System.out.println(max);
  }
} arv {
    
}
