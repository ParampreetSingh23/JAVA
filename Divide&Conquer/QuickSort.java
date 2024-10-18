public class QuickSort {
  public static void print(int arr[]){
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void quickSort(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int pidx = partition(arr, si, ei);
    quickSort(arr, si, pidx-1);
    quickSort(arr, pidx+1, ei);

  }
  public static int partition(int arr[],int si,int ei){
    int pivot = arr[ei];
    int i = si - 1;
    for(int j = si ; j<ei;j++){
      if(arr[j]<=pivot){
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }
  public static int search(int arr[],int tar,int si,int ei){
    if(si>ei){
      return -1;
    }
    int mid = si + (ei-si)/2;
    if(arr[mid] == tar){
      return mid;
    }
    if(arr[si]<arr[mid]){
      if(arr[si]<=tar && tar<=arr[mid]){
        return search(arr, tar, si, mid-1);
      }
      else{
       return  search(arr, tar, mid+1, ei);
      }
    }
    else{
      if(arr[mid]<=tar && tar<=arr[ei]){
        return search(arr, tar, mid+1, ei);
      }
      else{
        return search(arr, tar, si, mid-1);
      }
    }
  
  }
  public static void main(String[] args) {
    int arr[] = {6,3,9,8,2,5};
    // quickSort(arr,0,arr.length-1);
    // print(arr);
   System.out.println( search(arr, 0, 0, arr.length-1));
  }
}
