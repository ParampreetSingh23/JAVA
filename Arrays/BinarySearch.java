import java.util.Scanner;

public class BinarySearch {
  public static int search(int arr[],int key){
    
    int start = 0,end=arr.length-1;
    while(start<=end){
      int mid;
      mid = (start+end)/2;
      if(arr[mid] == key){
        return mid;
      }
      else if(mid<key){
        start = mid+1;
        

      }
      else{
       end = mid-1;

      }
    }
    return -1;
  }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n ,key;
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    key = sc.nextInt();
   System.out.println(("index of key is "+ search(arr,key)));
  }
 
}
