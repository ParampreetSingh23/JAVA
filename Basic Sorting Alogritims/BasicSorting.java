import java.util.*;
public class BasicSorting {
  public static void bubbleSort (int arr[]){
    for(int turns= 0;  turns<arr.length-1;turns++){
      for(int j = 0;j<arr.length-1-turns;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void selectionSort(int arr[]){
    for(int i = 0;i<arr.length-1;i++){
      int minPos = i;
      for(int j=i+1;j<arr.length;j++ ){
        if(arr[minPos]<arr[j]){
          minPos = j;
        }
      }
     int temp = arr[minPos];
     arr[minPos] = arr[i];
     arr[i] = temp;
    }
  }
  public static void insertionSort(int arr[]){
    for(int i = 1;i<arr.length;i++){
      int curr = arr[i];
      int prev = i-1;
      while (prev>=0 && arr[prev] > curr) {
        arr[prev+1]=arr[prev];
        prev--;
      }
      arr[prev+1]= curr;
    }
  }
  public static void countingSort(Integer arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
      largest = Math.max(largest,arr[i]);
    }
    int count[] = new int[largest+1];
    for(int i = 0;i<arr.length;i++){
      count[arr[i]]++;
    }
    //sorting
    int j = 0;
    for(int i = 0;i<count.length;i++){
      while (count[i]>0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }





  public static void printArr(Integer arr[]){
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer arr[] = {5,4,1,3,2,9,20,10};
 
    // selectionSort(arr);
    // bubbleSort(arr);
    // insertionSort(arr);
    countingSort(arr);
    
    // Arrays.sort(arr,Collections.reverseOrder());
    printArr(arr);
  }
  
}
