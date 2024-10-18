public class Questions {
  public static void OddEven(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){

      System.out.println("even");
    }
    else{
      System.out.println("Odd");
    }


  }
  public static int clearLastiBits(int n ,int i){
    int bitMask = ((~0)<<i);
    return n & bitMask;
    }
  public static boolean check2Power(int n){
    return (n&(n-1))==0;
  }
  public static int countSetBits(int n ){
    int count = 0;
    while(n>0){
      if((n & 1)!=0){
        count++;
      }
      n = n>>1;
    }
    return count;
  }
  public static int fastExpo(int a, int n){
    int ans = 1;
    while(n>0){
      if((n&1)!=0){
        ans = ans * a;
      }
      a = a * a;
      n= n>>1;
    }
    return ans;
  }
  public static void swap(int a, int b){
    System.out.println(a+" "+b);
    a = a+b;
    b = a - b;
    a = a -b;
    System.out.println(a+" "+b);
  }
  public static int add1(int n){
 return -~n;
  }
  public static void main(String[] args) {
    // OddEven(100);
  //  System.out.println( clearLastiBits(15, 2));
  // System.out.println(check2Power(6));
  // System.out.println(countSetBits(9));
  // System.out.println(fastExpo(3, 4));
  // swap(5, 4);
  System.out.println(add1(9));
  }
}
