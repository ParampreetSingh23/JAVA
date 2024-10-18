import java.util.Scanner;

public class code {
  public static boolean search(int arr[][] , int key){
    int n = arr.length , m = arr[0].length;
    for(int i = 0;i<n;i++){
      for(int j = 0;j<m;j++){
        if(arr[i][j] == key){
          System.out.println("key "+arr[i][j]);
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[][] = new int[3][3];
    int n = arr.length , m = arr[0].length;
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i<n;i++){
      for(int j = 0;j<m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
  search(arr, 6);
}
}
