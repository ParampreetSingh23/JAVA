import java.util.*;

public class Question {
 public static void printNonReapeating(String str){
  int freq[] = new int[26];
  Queue<Character> q = new LinkedList<>(); 
  for(int i = 0;i<str.length();i++){
   char ch = str.charAt(i);
    q.add(ch);
    freq[ch-'a']++;
    while (!q.isEmpty()&& freq[q.peek()-'a']>1) {
     q.remove();
    }
    if(q.isEmpty()){
     System.out.print(-1+" ");
    }else{
     System.out.print(q.peek()+" ");
    }

  }
  System.out.println();
 }
 public static void interLeave(Queue<Integer> q){
  Queue<Integer> first = new LinkedList<>();
  int size = q.size();
  for(int i = 0;i<size/2;i++){
   first.add(q.remove());
  }
  while (!first.isEmpty()) {
   q.add(first.remove());
   q.add(q.remove());
  }
 }
 public static void reversal(Queue<Integer> q){
  Stack<Integer> s = new Stack<>();
  while (!q.isEmpty()) {
   s.push(q.remove());
  }
  while (!s.isEmpty()) {
   q.add(s.pop());
  }
 }
public static void ReverseFirstKelementsofQueue(Queue<Integer> q, int k){
 Stack<Integer> s = new Stack<>();
 int size = q.size();
 for(int i = 0;i<k;i++){
  s.push(q.remove());
 }
 while(!s.empty()){
  q.add(s.pop());
 }
 for(int i = 0;i<size-k;i++){
  q.add(q.remove());
 }
}
public static int timeRequiredToBuy(int[] tickets) {
      Queue<Integer> q = new LinkedList<>();
      for(int i = 0;i<tickets.length;i++){
       q.add(tickets[i]);
      }
      int j = 0;
      while (!q.isEmpty()) {
       
       if(tickets[j]>0){
        tickets[j] = tickets[j] -1;
        q.remove();
        q.add(tickets[j]);
       }
       j++;
      }
      return j;  
}
 public static void main(String[] args) {
  // String str = "aabccx";
  // printNonReapeating(str);

  Queue<Integer> q  = new LinkedList<>();
  q.add(1);
  q.add(2);
  q.add(3);
  q.add(4);
  q.add(5);
  // ReverseFirstKelementsofQueue(q,3);
  // q.add(5);
  // q.add(6);
  // q.add(7);
  // q.add(8);
  // q.add(9);
  // q.add(10);
  // interLeave(q);
  
 //  while (!q.isEmpty()) {
 //   System.out.print(q.remove()+" ");
 //  }
 //  System.out.println();
 // }
int arr[] = {2,3,2};
System.out.println(timeRequiredToBuy(arr));
}
}