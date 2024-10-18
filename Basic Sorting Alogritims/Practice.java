

public class Practice {
  public static void buubleSort(int arr[]){
    for(int i = 0;i<arr.length-1;i++){
      for(int j = 0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;}
      }
    }
  }
public static void selectionSort(int arr[]){
for(int i = 0;i<arr.length-1;i++){
  int min = i;
  for(int j = i+1;j<arr.length;j++){
    if(arr[min]>arr[j]){
      min = j;
    }
  }
  int temp = arr[min];
  arr[min] = arr[i];
  arr[i] = temp;
}
}
public static void insertionSort(int arr[]){
  for(int i = 1;i<arr.length;i++){
    int curr = arr[i];
    int prev = i-1;
    while(prev>=0 && arr[prev]>curr){
      arr[prev+1] = arr[prev];
      prev--;
    }
    arr[prev+1] = curr;
  }
}


  public static void printArr(int arr[]){
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
public static void kadanesAlgo(int arr[]){
  int cs = 0;
  int ms = Integer.MIN_VALUE;
  for(int i = 0;i<arr.length;i++){
    cs+=arr[i];
    if(cs<0){
      cs=0;
    }

    ms =   Math.max(cs, ms);
  }
System.out.println(ms);
  
}
  
  public static void main(String[] args) {
    int arr[] = {100,101,34,2,5,6,102};
    // buubleSort(arr);
    // selectionSort(arr);
    // insertionSort(arr);
    // printArr(arr);
    kadanesAlgo(arr);
  }
}
