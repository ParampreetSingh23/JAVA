import java.util.*;


public class Stings {
  public static void printString(String str){
    for(int i = 0;i<str.length();i++){
      System.out.print(str.charAt(i));
      System.out.println();
    }

  }
  public static String substring(String str,int si,int ei){
    String substr = "";
    for(int i = si;i<ei;i++){
      substr +=str.charAt(i);
    }
    return substr;
  }
  public static void main(String[] args) {
    // char arr[] = {'a','b','c','d'};
    // String str = "abcd";
    // String str1 = new String("xyz");
    // Scanner sc  = new Scanner(System.in);
    // String name; 
    // name =  sc.nextLine();
    // String lname = "Singh";
    // System.out.print(name.charAt(3));
    String str = "pamma";
    String str2 = "pamma";
    String str3 = new String("pamma");

    // if(str==str2){
    //   System.out.println("Equal");
    // }
    // else
    //   System.out.println("Not Equal");
    
    // if(str.equals(str3)){
    //   System.out.print("Equal");
    // }
    // else
    //   System.out.print("Not Equal");
    
    // printString(str);

    System.out.println(substring(str3, 0, 4));

  }
}
