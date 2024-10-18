

public class BitwiseOperators {
  public static void leftShift(int a,int b){
    System.out.println(a<<b);
  }
  public static void rightShift(int a,int b){
    System.out.println(a>>b);
  }
  public static void main(String[] args) {
    // System.out.println(~5 );
    leftShift(5, 2);
    rightShift(6,2);
    
  }
}
