public class FindMissingandRepeatedValues {
 public static void solve(int arr[][]){
  int n = arr.length;
  int a = -1;
  int b = -1;
  
  int count[] = new int[n*n+1];
  for(int i = 0;i<arr.length;i++){
   for(int j = 0;j<arr[0].length;j++){
    count[arr[i][j]]++;
   }
  }
  for(int i = 1;i<count.length;i++){
   if(count[i]>1){
    a = i;
   }
   if(count[i]<1){
    b =i;
   }
 
  }
  int expectedSum = (n * n * (n * n + 1)) / 2;
  System.out.println(a+" "+b);
 }
 public static void main(String[] args) {
  int arr[][] = {{1,3},{2,2}};
  solve(arr);
 }
}
