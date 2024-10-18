public class BinaryToDecimal {
  
  public static void DecimalToBinary(int a){
    int n = 0;
    int sum = 0;
    while(a>0){
      
      int last_digit = a%10;
       sum = sum + (last_digit *(int)Math.pow(2, n));
      a/=10;
      n++;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    DecimalToBinary(101);
  }
}
