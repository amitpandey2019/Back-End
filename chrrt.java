 import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
char c=printupperlower(ch);
System.out.println(c);
    }
	public static char printupperlower(char ch){
		if(ch>='a' && ch<='z'){
			return 'L';
		}
		else if(ch>='A' && ch<='Z'){
			return 'U';
		}
		else{
			return'I';
		}
	}
} {
    
}
