public class PairArr {
  public static void pairArr(int arr[]){
    for(int i = 0;i<arr.length-1;i++){
      for(int j = i;j<arr.length;j++){
        if(arr[i]==arr[j]){
          break;
        }
        else{
          System.out.print(arr[i]+","+arr[j]+" ");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    pairArr(arr);
  }
}
