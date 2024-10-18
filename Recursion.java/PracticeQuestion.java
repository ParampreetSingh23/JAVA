public class PracticeQuestion {
  public static void findPos(int arr[],int key,int i){
    if(i == arr.length){
      return ;
    }
    if(key == arr[i]){
    System.out.println(i+" ");
    }
    findPos(arr, key, i+1);
  }
  public static void convert(String str ,int i){
    if(i == str.length()){
      return;
    }
    if(str.charAt(i)==)
  }
  public static void main(String[] args) {
    

    int arr[] = {3,2,4,5,6,2,7,2,2};
    int key = 2;
    findPos(arr, key, 0);
    System.out.println();
  }
  
}
