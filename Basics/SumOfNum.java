public class SumOfNum {
  public static void numSum(int a){
    int sum = 0;
    while(a>0){
      int last_digit = a%10;
      sum = sum + last_digit;
      a/=10;
    }
    System.out.println(sum);

  }
  public static void main(String[] args){
    numSum(123);
  }
}
