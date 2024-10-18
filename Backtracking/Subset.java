public class Subset {
  public static void findSubsets(String str,String ans,int i){
    if(i==str.length()){
      System.out.println(ans);
      return;
    }
    //yes choice
    findSubsets(str, ans+str.charAt(i), i+1);
    //no choice
    findSubsets(str, ans, i+1);
  }
  public static void printSubstring(String str,String ans,int i){
    if(i==str.length()){
      // System.out.println(ans);
      return;
    }
    printSubstring(str, ans+str.charAt(i), i+1);
    if(isPalindrome(ans)){
      System.out.println(ans);
    }
    printSubstring(str, ans, i+1);
    if(isPalindrome(ans)){
      System.out.println(ans);
    }
  
  
  }
  public static boolean isPalindrome(String str) {
    // Remove non-alphanumeric characters and convert to lowercase
    String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
    int left = 0;
    int right = cleanStr.length() - 1;
    
    while (left < right) {
        if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
}
  public static void main(String[] args) {
    String str = "abc";
    // findSubsets(str, "", 0);
    printSubstring(str,"", 0);
  }
}
