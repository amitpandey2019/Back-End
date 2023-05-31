import java.util.*;
public class Array{

    public static void main(String[]args){

    //int marks[] = {97, 98, 99};
    //marks[0] = 97; // phy 
    //marks[1] = 98; // chem
    //marks[2] = 99; // eng
    //System.out.println(marks[0]);
    //System.out.println(marks[1]);
    //System.out.println(marks[2]);
    Scanner sc = new Scanner(System.in); 
    int size = sc.nextInt();
    int numbers[] = new int[size];
//input
    for(int i=0; i<size; i++){
       numbers[i] = sc.nextInt();
    }
    int x = sc.nextInt();

    //output
    for(int i=0; i<numbers.length; i++) {
        if(numbers[i] == x){
            System.out.println("x found at index : " + i);
        } 
    }
}
} 
