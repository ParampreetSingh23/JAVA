import java.lang.Math;
public class code {
  public static int sumOfSq(){
    int result =0;
    for(int i = 1;i<=100;i++){
      result += Math.pow(i,2);
    }
    return result;
  }
  public static double sqOfSum(){
    int sum =0;
    for(int i = 1;i<=100;i++){
      sum += i;
    }
   double result = Math.pow(sum, 2);
    return result;
  }
  public static void main(String[] args) {
    System.out.println(sqOfSum());
  
  System.out.println(sqOfSum()-sumOfSq());
}
}
