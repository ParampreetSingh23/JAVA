import java.util.Scanner;

public class searchElement {
  public static void search(int arr[],int key){
    
    int start = 0,end=arr.length-1;
    while(start<=end){
      int mid;
      mid = start + (end-start)/2;
      if(arr[mid] == key){
       System.out.println("YES");
       break;
      }
      else if(mid<key){
        start = mid+1;
        
        

      }
      else if(mid > key){
       end = mid-1;

      }
      else{
        System.out.println("NO");
        break;
      }
  
      
    }
   
   
  }
  public static int highestMountain(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
      if(arr[i]>largest){
        largest = arr[i];
      }
    }
    return largest;
  }
  
  
  public static void main(String[] args) {

    int arr[] = {2,1,0,1};
    
    System.out.println(highestMountain(arr));
    
  }
}
