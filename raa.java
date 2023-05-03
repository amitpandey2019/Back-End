 import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
int k=arr.length-1;
for(int i=0;i<arr.length;i++){
	arr[i]=s.nextInt();
}

for(int i=0;i<arr.length/2;i++){
  int temp=arr[i];
  arr[i]=arr[k];
  arr[k]=temp;
  k--;
}
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}

    }
} {
    
}
