public class DiagonalSum {
  public static void calcDiagSum(int arr[][]){
    int sum = 0;
   int n = arr.length;
    //Compllexity = O(n^2);
  
    // for(int i = 0;i<n;i++){
    //   for(int j = 0;j<arr[0].length;j++){
    //     if(i==j){
    //       sum+=arr[i][j];
    //     }
    //    else if(i+j==n-1){
    //     sum+=arr[i][j];
    //    }
    //   }
    // }
    //linear complexity O(n)
    for(int i = 0;i<n;i++){
      //primary
      sum+= arr[i][i];
      //secondary
      if(i != n-i-1)
      sum+=arr[i][n-i-1];
    }
   System.out.println(sum);
  }
  public static void main(String[] args) {
    int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,}};
    calcDiagSum(arr);
  }
}
