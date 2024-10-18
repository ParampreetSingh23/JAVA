import java.util.*;
public class SortStack {
 public static  Stack<Integer> sort(Stack<Integer> s) {
  ArrayList<Integer> list = new ArrayList<>();
  int size = s.size();
  for(int i = 0 ;i<size;i++){
   list.add(s.pop());
  }
  Collections.sort(list);
  for(int i = 0;i<list.size();i++){
   s.push(list.get(i));
  }
  return s;
}
 public static void main(String[] args) {
  Stack<Integer> s = new Stack<>();
  s.push(41);
  s.push(3);
  s.push(32);
  s.push(2);
  s.push(11);
  sort(s);
  while (!s.isEmpty()) {
   System.out.print(s.pop()+" ");
  }

 }
}
