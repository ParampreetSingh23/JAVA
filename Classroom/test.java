public class test { 
 public static boolean f(String s) { 
   int i = s.length(); 
   if (i >= 3 && s.charAt(i-1) == 'n' && s.charAt(i-2) == 'a' && s.charAt(i-3) == 's') { 
     return true; 
   } 
   return false; 
 } 
 public static int stringComp(String S,String T){
  
  for(int i = 0;i<S.length();i++){
   if(S.charAt(i)!=T.charAt(i)){
    return i+1;
   }
   
  }
  return 0;
 }

 public static void main(String[] args) { 
   String str = "abcde"; 
   String str2 = "abedc";
   // if (f(str)) { 
   //   System.out.println("yes"); 
   // } else { 
   //   System.out.println("No"); 
   // } 
   System.out.println(stringComp(str, str2));
 }
}
