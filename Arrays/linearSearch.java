import java.util.*;
public class linearSearch {
  public static void search(int arr[],int key){
    for(int i = 0;i<arr.length;i++){
      if(arr[i]==key){
        System.out.println(key+" is at index "+i);
        break;
      }
    }
  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Size of Array");
   int n = sc.nextInt();
   System.out.println();
   int marks[] = new int[n];
   for(int i = 0;i<marks.length;i++){
    marks[i] = sc.nextInt();
   }
   System.out.println("Enter the KEY");
   int key = sc.nextInt();
 search(marks, key);

  }
}
