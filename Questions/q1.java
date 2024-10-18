import java.util.*;
public class q1 {
 public static void calc(int n) {
  int oddProduct = 1;
        int evenProduct = 1;
        boolean hasOdd = false;
        boolean hasEven = false;

        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                oddProduct *= lastDigit;
                hasOdd = true;
            } else {
                evenProduct *= lastDigit;
                hasEven = true;
            }
            n /= 10;
        }

        if (!hasOdd) oddProduct = 0;
        if (!hasEven) evenProduct = 0;

        int sum = oddProduct + evenProduct;

        System.out.println("Product of odd digits: " + oddProduct);
        System.out.println("Product of even digits: " + evenProduct);
        System.out.println("Sum of products: " + sum);
    
 }
 public static void sumOfLargest(int n ){
  int max = -1;
  int temp =  n;
  int sum = 0;
  int scnMax=-1;
  while (temp>0) {
   int lastDigit = temp%10;
   if(max<lastDigit){
    scnMax = Math.max(scnMax, max);
    max = lastDigit;
   }else if(scnMax<lastDigit){
    scnMax = lastDigit;
   }
   temp /= 10;
  }
  if(scnMax == max){
   scnMax = 1;
  }
  sum = max + scnMax;
  System.out.println(sum);
 }
 public static void missingNum(int n,int size){
  int sumNat = 0;
  int actSum = 0;
  int temp = n;
  while (temp>0) {
   int lastDigit = temp%10;
   actSum += lastDigit;
   temp/=10;
  }
  for(int i = 1;i<=size;i++){
   sumNat +=i;
  }
  System.out.println(sumNat-actSum);
 }
 public static void arrayQues(int arr[]){
  int count = 0;
  for(int i = 1;i<arr.length;i++){
   if(arr[i]>=arr[i-1]){
    continue;
   }else{
    while (arr[i]<arr[i-1]) {
     arr[i] = arr[i] + 1;
     count++;
    }
   }
  }
  System.out.println(count);
 }
 public static void print(int arr[]){
  for(int i = 0;i<arr.length;i++){
   System.out.print(arr[i]+" ");
  }
  System.out.println();
 }
 public static void DNA(String str){
  int count = 0;
  Queue<Character> s = new LinkedList<>();
 
  for(int i = 0 ;i<str.length();i++){
   s.add(str.charAt(i));
  }
  int size = s.size();
  while(!s.isEmpty()){
   if(s.remove()=='C'){
   count++;
 
   }else{
    
    count = 0;
   }
  }
  System.out.println(count);
 }
 public static void main(String[] args) {
    //  int arr[] = {1,2,0,3,1};
    // print(arr);
    // arrayQues(arr);
    // print(arr);
    String str = "AACCCGIIICCCC";
    DNA(str);
    
 }
}