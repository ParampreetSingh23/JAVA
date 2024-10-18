public class DecimalToBinary {
  public static void DecToBin(int a){
    int bin =0;
   
    while(a>0){
      int rem = a%2;
      
      bin = bin*10 + rem;
      a/=2;


    }
    System.out.println(bin);
  }
    public static void main(String[] args) {
      DecToBin(5);
    }
}

