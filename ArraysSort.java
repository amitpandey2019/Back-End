public class ArraysSort {
    public static int search(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key)
            return i;   
        }
        return -1;
    }
    public static void main(String[]args) {
      int a1[] = new int[] {3,6,2,9,5,8,1};   
      for(int i =0;i<a1.length;i++) {
        System.out.println(a1[i]);
      }
    //Array.sort(a1);
    //System.out.println();
    //for(int i =0;i<a1.length;i++){
      //  System.out.print(a1[i]);  
      //}
      int indexValue = search(a1,9);
      if(indexValue == -1)
      System.out.println("element not found");
      else
      System.out.println("elements is found and is at index "+indexValue);
    }
}
