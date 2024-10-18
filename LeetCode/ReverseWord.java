import java.util.Stack;

public class ReverseWord {
  public static String reverseWords(String str) {
        
           String[] arrOfStr = str.split("\\.");
           Stack<String> s = new Stack<>();
           StringBuilder sb = new StringBuilder();
           
           for (String a : arrOfStr) {
               s.push(a);
           }
           
           while (!s.isEmpty()) {
               sb.append(s.pop());
               if (!s.isEmpty()) {
                   sb.append(".");
               }
           }
           
           return sb.toString();
    }
   public static void main(String[] args) {
       String str = "i.like.this.program.very.much";
       System.out.println(reverseWords(str));
   }
}
