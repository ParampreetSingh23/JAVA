import java.util.Scanner;

public class LargestNum {
  public static void search(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
      if(arr[i]>largest){
        largest = arr[i];
      }
    }
    System.out.print("Largest elem is : "+largest);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n ;
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    search(arr);
  }
}
