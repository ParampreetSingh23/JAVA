package stack;
import java.util.*;
public class NextGreaterEle {
 public static void main(String[] args) {
  Stack<Integer> s = new Stack<>();
  int arr[] = {6,1,8,9,0};
  int nextGreater[] = new int[arr.length];
  for(int i = arr.length-1;i>=0;i--){
   //while loop
   while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
    s.pop();
   }
   //if
   if(s.isEmpty()){
    nextGreater[i] = -1;
   }else{
    nextGreater[i] = arr[s.peek()];
   }
   s.push(i);
  }
  for(int i = 0;i<nextGreater.length;i++){
   System.out.print(nextGreater[i]+" ");
  }
 }
}
