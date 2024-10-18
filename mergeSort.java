public class mergeSort {
  public static void print(int arr[]){
    for(int i =0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }
  }
  public static void sort(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int mid = si + (ei-si)/2;
    sort(arr, si, mid);
    sort(arr, mid+1, ei);
    merge(arr,si,mid,ei);
  }
  public static void merge(int arr[],int si,int mid,int ei){
      int temp[] = new int[ei-si+1];
      int left = si;
      int right = mid+1;
      int k = 0;
      while (left<=mid&&right<=ei) {
        if(arr[left]<arr[right]){
          temp[k++] = arr[left++];
        }else{
          temp[k++] = arr[right++];
        }
      }
      while (left<=mid) {
        temp[k++] = arr[left++];
      }
      while (right<=ei) {
        temp[k++] = arr[right++];
      }
      for(k=0,left=si;k<temp.length;k++,left++){
        arr[left] = temp[k];
      }
  }
public static void main(String[] args) {
  int arr[] =  {5,2,1,3,4};
  sort(arr,0,arr.length-1);
  print(arr);
}
}
