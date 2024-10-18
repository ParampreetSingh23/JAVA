import java.util.Arrays;

public class checkAnagram {
  public static boolean check(String str,String str1){
    if (str.length() != str1.length()) {
      return false;
  }
    char arr1[] = str.toCharArray();
    char arr2[] = str1.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
  }
  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder sb = new StringBuilder("");
     StringBuilder sb1 = new StringBuilder("");
    for(int i = 0 ; i<word1.length;i++ ){
        sb.append(word1[i]);
    }
       for(int i = 0 ; i<word2.length;i++ ){
        sb1.append(word2[i]);
    }
    String str = sb.toString();
    String str1 = sb1.toString();
    return str.equals(str1);
}
  public static void main(String[] args) {
      String str[] ={"abc", "d","defg"};
      String str1[] = {"abcddefg"};
      System.out.println(arrayStringsAreEqual(str, str1));
  }
}
