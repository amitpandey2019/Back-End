import java.util.*;
public class Main {
    public static void main(String args[]) {
		// You Code Here
       Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int reverse=0;
	   while(n>0) {

	   reverse=(n%10)+reverse*10;
	   n=n/10;
	   }
       System.out.println(reverse);
	} 
  }