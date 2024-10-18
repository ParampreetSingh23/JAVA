import java.util.Scanner;

public class Functions {
  //  public static int sum(int a,int b){
  //   return a+b;
  // }
  // public static float sum(float a,float b){
  //   return a+b;
  // }
  // public static int sum (int a,int b,int c){
  //   return a+b+c;
  // }
  public static boolean checkPrime(int a){
    if(a==2){
      return true;
    }
    boolean res = true ;
    for(int i = 2;i<=Math.sqrt(a);i++){
      if(a%i==0){
        res = false;
        break;
      }
    }
    return res;
  }
  public static void primeRange(int n){
    for(int i = 2;i<=n;i++){
      if(checkPrime(i)){
        System.out.println(i);
      }
    }
  }
  public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println(sum(15.5f,15.5f));
    // System.out.println(sum(100,100));
    // System.out.print(checkPrime(10));
    primeRange(100);
  }
}
