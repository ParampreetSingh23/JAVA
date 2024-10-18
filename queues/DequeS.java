import java.util.*;

public class DequeS {
 static class Stack{
  static Deque<Integer> deque = new LinkedList<>();
  //isEmpty
  public static boolean isEmpty(){
   return deque.isEmpty();
  }
  //add
  public static void push(int data){
   deque.addLast(data);
  }
  //remove 
  public static int pop(){
   if(deque.isEmpty()){
    System.out.println("Empty");
    return -1;
   }
   int last = deque.removeLast();
   return last;
  }
  //peek
  public static int peek(){
   if(deque.isEmpty()){
    System.out.println("Empty");
    return -1;
   }
   return deque.peek();
  }
 }
 public static void main(String[] args) {
  Stack s = new Stack();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);
  s.pop();
 
  while (!s.isEmpty()) {
   System.out.print(s.pop()+" ");
  }
  
 }
}
