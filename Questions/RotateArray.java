import java.util.*;
public class RotateArray {
 public static void rotate(int arr[],int d){
  if(d>arr.length){
   return;
  }else{
   Stack<Integer> q = new Stack<>();
   ArrayList<Integer> list = new ArrayList<>();
   for(int i = arr.length-1;i>=d;i--){
    q.push(arr[i]);
   }
   int size = q.size();
   while(!q.isEmpty()){
    list.add(q.pop());
   }
   for(int i = 0;i<d;i++){
    list.add(arr[i]);
   }
   for(int i = 0;i<arr.length;i++){
    arr[i] = list.get(i);
   }
  }


 }
 public static void print(int arr[]){
  for(int i = 0;i<arr.length;i++){
   System.out.print(arr[i]+" ");
  }
  System.out.println();
 }
public static void main(String[] args) {
 int arr[] = {10};
 // print(arr);
 // rotate(arr, 101);
 // print(arr);
 System.out.println(7%5);
}
}
