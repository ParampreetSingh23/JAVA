public class practice{
  public  static void printArr(int arr[]){
    for(int i= 0;i<arr.length;i++){
      System.out.print(arr[i]+"  ");
    }
  }
  public static void bubbleSort(int arr[]){
    for(int turn  = 0;turn < arr.length-1;turn++){
      for(int j = 0;j<arr.length-1-turn;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] =  arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void selectionSort(int arr[]){
    for(int i = 0;i<arr.length-1;i++){
      int minPos = i;
      for(int j = i+1;j<arr.length;j++){
        if(arr[minPos]>arr[j]){
          minPos = j;
        }
      }
      int temp = arr[minPos];
      arr[minPos] = arr[i]; 
      arr[i] = temp;
    }
  }
  public static void mergeSort(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int mid = si + (ei-si)/2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid+1, ei);
    merge(arr, si, mid, ei);
  }
  public static void merge(int arr[],int si,int mid,int ei){
     int temp[] = new int[ei-si+1];
     int i = si;
     int j = mid+1;
     int k=0;
     while(i<=mid && j<=ei){
      if(arr[i]<arr[j]){
        temp[k]  = arr[i];
        i++;
      }
      else{
        temp[k] = arr[j];
        j++; 
      }
      k++;
     } 
     while (i<=mid) {
      temp[k++] = arr[i++];
     }
     while (j<=ei) {
      temp[k++] = arr[j++];
     }
     for(k=0,i=si;k<temp.length;k++,i++){
      arr[i] = temp[k];
    }
  }
  public static void insertionSort(int arr[]){
    for(int i = 1;i<arr.length;i++){
      int curr = arr[i];
      int prev = i-1;
      while(prev>=0&&arr[prev]>curr){
          arr[prev+1] = arr[prev];
          prev--;
      }
      arr[prev+1] = curr;
    }
  }
  public static void main(String[] args) {
    int arr[] = {5,4,2,3,1};
    // bubbleSort(arr);
    // selectionSort(arr);
    // mergeSort(arr, 0, arr.length-1);
    insertionSort(arr);
    printArr(arr);
  }
}