

import java.util.Stack;
public class StackSolution {
    public static void main(String[]args) {
      Stack<Integer> s1=new Stack<>();
//inserting element into stack
      s1.push(2);
      s1.push(4);
      s1.push(9);
      System.out.println(s1);
// delete opration on stack
      s1.pop(); 
      System.out.println(s1);
     // peek opration 
      System.out.println(s1.peek());
      s1.pop();
      s1.pop();
      boolean status = s1.empty();
      System.out.println(status);
      int indexfound = s1.search(4);
      System.out.println(indexfound);

      Iterator it = s1.iterator();
     while(it.hasNext()){
      Obeject s2 = it.next();
      System.out.print(s2);
     }
    }
}