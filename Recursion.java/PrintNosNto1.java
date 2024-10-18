public class PrintNosNto1 {
  public static void printnos(int n) {
    if (n == 1) {
      System.out.print(n);
      return;
    }
    printnos(n - 1);
    System.out.print(n + "  ");

  }

  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    int fnm1 = fact(n - 1);
    int fn = n * fnm1;
    return fn;
  }

  public static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    int fnm1 = sum(n - 1);
    int sum = n + fnm1;
    return sum;

  }
  public static int fib(int n ){
    if(n==0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    int fibnm1 = fib(n-1);
    int fibnm2 = fib(n-2);
    return fibnm1+fibnm2;
  }
  public static boolean isSorted(int arr[],int i ){
    if(i==arr.length-1){
      return true ;
    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    return isSorted(arr, i+1);
  }
  public static int firstOccurrence(int arr[],int i,int key){
    if(i==arr.length){
      return -1;
    }
    if(key == arr[i]){
      return i;
    }
    return firstOccurrence(arr, i+1, key);
   

  }
  public static int tilingProblem(int n){
    if(n==0||n==1){
      return 1;
    }
    int fnm1 = tilingProblem(n-1);
    int fnm2 = tilingProblem(n-2);
    int totWays = fnm1+fnm2;
    return totWays;
  }
  public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
    if(idx == str.length()){
      System.out.println(newStr);
      return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar-'a']==true){
      removeDuplicates(str, idx+1, newStr, map);
    }else{
      map[currChar-'a'] = true;
      removeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
  }
  public static int fndPairPrblm(int n){
    if(n==1||n==2){
      return n;
    }
    int fnm1 = fndPairPrblm(n-1);
    int fnm2 = fndPairPrblm(n-2);
    int totWays = fnm1 + (n-1)*fnm2;
    return totWays;
  }
  public static void printBinStrings(int n ,int lastPlace ,String str){
    if(n==0){
      System.out.println(str);
      return;
    }
    printBinStrings(n-1, 0, str+"0");
    if(lastPlace == 0){
      printBinStrings(n-1, 1, str+"1");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1,2,7,5,5};
    String str ="zpaaraampreet";
    // printnos(100);
    // System.out.println( fact(6));
    // System.out.println(sum(6));
    // System.out.println(fib(9));
    // System.out.println(fib(25));
    // System.out.println(isSorted(arr, 0));
    // System.out.println(firstOccurrence(arr,0,5));
    // System.out.println(tilingProblem(4));
    // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    // System.out.println(fndPairPrblm(2));
    printBinStrings(4, 0, "");
  }
}
