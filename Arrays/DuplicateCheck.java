import java.util.Scanner;

public class DuplicateCheck {
  public static boolean checkDuplicate(int arr[]){
   boolean res = false;
   for(int i = 0;i<arr.length;i++){
    for(int j = i+1;j<arr.length;j++){
      if(arr[i]==arr[j]){
        res = true;
      }
    }
   }
return res;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(checkDuplicate(arr));
  }
}
