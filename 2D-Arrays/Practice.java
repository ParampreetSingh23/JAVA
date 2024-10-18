public class Practice {
  public static void printSpiral(int arr[][]) {
    int startRow = 0;
    int endRow = arr.length - 1;
    int startCol = 0;
    int endCol = arr[0].length - 1;
    while (startRow <= endRow && startCol <= endCol) {
      // top
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(arr[startRow][j] + " ");
      }
      // right
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(arr[i][endCol] + " ");
      }
      // bottom
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(arr[endRow][j] + " ");
      }
      // left
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(arr[i][startCol] + " ");
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    System.out.println();

  }

  public static void calcSeven(int arr[][], int key) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] == key) {
                System.out.println("Found " + key + " at position (" + i + ", " + j + ")");
                count++;
            }
        }
    }
    System.out.println("Total occurrences of " + key + ": " + count);
  }
  public static void rowSum(int arr[][],int row){
    int sum = 0;
    for(int j = 0;j<arr[0].length;j++){
      sum += arr[row][j];
    }
    System.out.println(sum);
  }
public static void transpose(int arr[][]){
  for(int i = 0;i<arr[0].length;i++){
    for(int j = 0;j<arr.length;j++){
      System.out.print(arr[j][i]+" ");
   
    }
    System.out.println();
  }

  
}
  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 7, 4 }, { 7, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 7, 16 } };
    int arr1[][] = {{1,2,3},{4,5,6}};
    // printSpiral(arr);
    // calcSeven(arr, 7);
    // rowSum(arr, 1);
    transpose(arr1);
  }
}
