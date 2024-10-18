public class AdvancePatterns {
  public static void hollowRectangle(int row ,int col){
    for(int i = 1;i<=row;i++){
      for(int j = 1;j<=col;j++){
        if(i == 1 || i == row || j==1 || j==col){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }
  public static void invAndRotatedHalfPyr(int a){
    for(int i =1;i<=a;i++){
      for(int j =1 ;j<=a-i;j++){
        System.out.print(" ");
      }
      for(int j =1 ;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
      }
      System.out.print("\n");
    }
    public static void invHalfPyrWithNums(int n){
      for(int i = 1;i<=n;i++){
        for(int j = 1 ;j <= n;j++){
          if(j<=n-i+1){
            
          }
         
        }
        System.out.println();
      }
    }
    public static void floydTriangle(int n ){
      int counter = 1;
      for (int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++){
          System.out.print(counter);
          counter++;
        }
        System.out.println();
      }
    }
  public static void Triangle0_1(int a){
    for(int i = 1;i<=a;i++){
      for(int j = 1;j<=i;j++){
        if((i+j)%2==0){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
  public static void butterflyPattern(int n ){
    //upper half
    for(int i = 1;i<=n;i++){
      for(int j = 1;j<=i;j++){
        System.out.print("*");
      }
      for(int j = 1;j<=(n-i)*2;j++){
        System.out.print(" ");
      }
      for(int j = 1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //lower half
    for(int i = n;i>=1;i--){
      for(int j = 1;j<=i;j++){
        System.out.print("*");
      }
      for(int j = 1;j<=(n-i)*2;j++){
        System.out.print(" ");
      }
      for(int j = 1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }


  }
  public static void soildRhombus(int a){
    for(int i = 1;i<=a;i++){
      for(int j = 1;j<=a-i+1;j++){
        System.out.print(" ");
      }
      for(int j = 1;j<=a;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void hollowRhombus(int n){
    for(int i =1;i<=n;i++){
      for(int j = 1;j<=n-i+1;j++){
        System.out.print(" ");
      }
      for(int j = 1;j<=n;j++){
        if(i==1||j==1||i==n||j==n)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void diamondPattern(int n){
    for(int i=1;i<=n;i++){
      for(int j =1 ;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j =1 ;j<=(2*i-1);j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = n ;i>=1;i--){
      for(int j =1 ;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j =1 ;j<=(2*i-1);j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    // hollowRectangle(11, 10);
    // invAndRotatedHalfPyr(10);
    // invHalfPyrWithNums(10);
    // floydTriangle(5);
    // Triangle0_1(5);
    // butterflyPattern(4);
    // soildRhombus(5);
    // hollowRhombus(5);
    diamondPattern(4);
  }
}
