import java.util.Random;
public class questions {
  public static void func1(int array[],int length){
    int sum = 0;
    int product = 1;
    for(int i = 0;i<length;i++){
      sum+=array[i];
    }
    for(int i = 0;i<length;i++){
      product*=array[i];
    }
  }
  public static void func2(int n){
    int sum=0;
    int product =1;
    for (int i = 0; i <n; i++)
    {
        for (int j = 0; j < n; j++)
        {
          System.out.println(i+" "+j);
        }
    }
  }
  public static int func3(int n){
    Random rand = new Random();
    int i ;
    if(n<=0){
      return 0;
    }
    else{
      i = rand.nextInt(n-1);
      System.out.println("this");
      return func3(i) + func3(n-1-i);
    }
  }
  public static void main(String[] args) {
    // int array[] = {3,5,66};
    // func1(array, 3);
    // func2(5);
    System.out.println(    func3(3));

  }
}
