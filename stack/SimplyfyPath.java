import java.util.*;

public class SimplyfyPath {
 public static void simplify(String path){
  Stack<String> stack = new Stack<>();
  StringBuilder sb = new StringBuilder();
  String token[] = path.split("/");
  for(String t:token){
   if ("..".equals(t)) {
    if (!stack.isEmpty()) {
        stack.pop();
    }
} else if (!("".equals(t) || ".".equals(t))) {
    stack.push(t);
}
  }
 for(String s:stack){
  sb.append("/").append(s);
 }
 System.out.println(sb.toString());
  
 }
 public static void main(String[] args) {
     String str = "../a/b/../c/////";
     simplify(str);
 }
}
