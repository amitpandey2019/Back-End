import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int count=1;
int i=1;
while(count<=n1){
      if((3*i+2)%n2!=0){
		  System.out.println(3*i+2);
		  count++;
	  }
	     i++;
	  }
    }
}