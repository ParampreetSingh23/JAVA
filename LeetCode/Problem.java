import java.util.*;
public class Problem{
public static boolean isPalindrome(int x) {
  int temp = x;
  int digit = 0;
  while(temp>0){
      int last_digit = temp%10;
      digit = digit*10+ last_digit;
      temp/=10;

  }
  if(digit == x){
      return true;
  }
  return false;
}
public static int[] twoSum(int nums[],int target){
  int res[] = new int[2];
  for(int i = 0;i<nums.length-1;i++){
    for(int j = i+1;j<nums.length;j++){
      if(nums[i]+nums[j]==target){
        res[0] = nums[i];
        res[1] = nums[j];

      }
    }
  }
  return res;
}
public static int romanToInt(String s) {
  int sum = 0;
  for(int i  = 0;i<s.length();i++){
 
      if(s.charAt(i)=='X'&&s.charAt(i+1)=='C'){
        sum+=90;
      }
      else if(s.charAt(i)=='C'&&s.charAt(i+1)=='M'){
        sum+=900;
      }
      else if(s.charAt(i)=='I'&&s.charAt(i+1)=='V'){
        sum+=4;
      }
      else if(s.charAt(i)=='V'){
          sum+=5;
      }
      
      else if(s.charAt(i)=='I'){
        sum+=1;
    }
      else if(s.charAt(i)=='X'){
          sum+=10;
      }
        else if(s.charAt(i)=='L'){
          sum+=50;
      }
        else if(s.charAt(i)=='C'){
          sum+=100;
      }
        else if(s.charAt(i)=='D'){
          sum+=500;
      }
   
      else{
          sum+=1000;
      }

  }
  return sum;
}
public static String distinct(String str[],int k){
  int count = 0;
  StringBuilder sb = new StringBuilder("");
  for(int i = 0;i<str.length-1;i++){
    for(int j = i+1;j<str.length;j++){
      if(str[i]!=str[j]){
        sb.append(str[i]);
        count++;
        break;
      }
    }
  }
  return sb.toString();
}
public static void majorityEle(int arr[]){
  int temp[] = new int[arr.length];
buubleSort(arr);
System.out.println(arr[arr.length-1]);
  
  
}
public static int count(int arr[]){

 int res = -1;
 for(int i = 0;i<arr.length;i++){
  int count = 1;
  for(int j = 0;j<arr.length;j++){
    if(i!=j && arr[i] == arr[j]){
      count++;
    }
  }
  if(count >arr.length/2){
    res = arr[i];
    break;
  }
 }
 return res;
}
public static void print(int arr[]){
  for(int i = 0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
}
public static void sort(int arr[]){
  for(int i = 0;i<arr.length-1;i++){
    for(int j = 0;j<arr.length-1-i;j++){
      if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;

      }
    }
  }
}
public static void selectionSort(int arr[],int n){
  for(int i = 0;i<arr.length-1;i++){
      int min = i;
      for(int j = i+1;j<arr.length;j++){
          if(arr[j]<arr[min]){
              min = j;
          }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
  }
}
public static int missing(int arr[]){
  int natSum =0;
  int arrSum =0;
  for(int i = 0;i<arr.length;i++){
    arrSum+=arr[i];

  }
  for(int i = 1;i<=arr.length;i++){
    natSum+=i;
  }
  return natSum-arrSum;

}
public static void buubleSort(int arr[]){
  for(int i = 0;i<arr.length-1;i++){
   for(int j = 0;j<arr.length-1-i;j++){
    if(arr[j]>arr[j+1]){
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
    }
   }
  }
}
public static char findTheDifference(String s, String t) {
    StringBuilder sb = new StringBuilder(s);
    char res =' ';
        if(s.length()!=t.length()){
          for(int i = 0;i<t.length();i++){
            if(sb.charAt(i) != t.charAt(i)){
              res = t.charAt(i);
            }
          }
        }
        return res;
}
public static  String longestPrefix(String str[]){
  Arrays.sort(str);
  String first = str[0];
  String last = str[str.length-1];
  int min = Math.min(first.length(), last.length());
  int i  = 0;
  while(i<min  && first.charAt(i) == last.charAt(i)){
    i++;
  }
  if(i==0){
    return "";
  }
  return first.substring(0, i); 

  
}
  public static void main(String[] args) {
    String arr[]  = {"flower","flow","flight"};
    System.out.println(longestPrefix(arr));




 
  }
}
