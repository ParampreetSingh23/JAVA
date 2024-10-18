

public class Operations {
  public static void get(int i , int n ){
    int bitMask = (1<<i);
    if((n & bitMask)==0){
      System.out.println(i+" Bit is 0");
    }
    else{
      System.out.println(i+" Bit is 1");
    }
  }
  public static int set(int n ,int i ){
    int bitMask = 1<<i;
    return n | bitMask;
  }
  public static int clear(int n,int i ){
    int bitMask = ~(1<<i);
    return n & bitMask;
  }
  public static int update(int n , int i , int newBit){
    if(newBit==0){
      return clear(n, i);
    }    
else{
  return set(n, i);
}
  }
  public static void main(String[] args) {
    get(3, 10);
    System.out.println(set(10, 2));
    System.out.println(clear(10, 1));
    System.out.println(update(10, 2, 0));
  }
}
