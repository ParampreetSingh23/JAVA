import java.util.*;
public class MaxAreaofHistogram {
 public static void calcArea(int arr[]){
  Stack<Integer> s = new Stack<>();
  int nsr[] = new int[arr.length];
  int nsl[] = new int[arr.length];
  int maxArea = 0;
  //nsr

  for(int i = arr.length-1;i>=0;i--){
   while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
    s.pop();
   }
   if(s.isEmpty()){
    nsr[i] = arr.length;
   }else{
    nsr[i] = arr[s.peek()];
   }
   s.push(i);
  }
  //nsl
  s = new Stack<>();

  for(int i = 0;i<arr.length;i++){
   while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
    s.pop();
   }
   if(s.isEmpty()){
    nsl[i] = -1;
   }else{
    nsl[i] = arr[s.peek()];
   }
   s.push(i);
  }
  //calculate maximum
  for(int i = 0;i<arr.length;i++){
   int height = arr[i];
   int width = nsr[i] - nsl[i] -1;
   int currArea = height *width;
   maxArea = Math.max(maxArea, currArea);
  }
  System.out.println("max area  of histogram is: "+maxArea);
 }
 public static void main(String[] args) {
     int arr[] = {5,1,2,4};
     calcArea(arr);
 }
}
