

public class Palindrome {
 public static Node head;
 public static Node tail;
 
 public class Node {
   int data;
   Node next;

   Node(int data){
     this.data = data;
     this.next = null;
   }
 
  
 }
 public void print(){
   Node temp = head;
   if(head == null){
    System.out.println("Empty ll");
    return;
   }
   while (temp!=null) {
     System.out.print(temp.data + " ");
     temp = temp.next;
   }
   System.out.println();
 }
 public void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
     head = tail = newNode;
     return;
    }
    newNode.next = head;
  head = newNode;
 }
 public void addLast(int data){
  Node newNode = new Node(data);
  if(head == null){
   head = tail = newNode;
   return;
  }
  tail.next = newNode;
  tail = newNode;
 }
 //slow fast approach
 public Node findMid(Node head){
  Node slow = head;
  Node fast = head;
   while(fast!=null && fast.next == null){
    slow = slow.next;
    fast = fast.next.next;
   }
   return slow;
 }
 public boolean checkPalindrome(){
  if(head == null || head.next == null ){
   return true;
  }
 
  //step -1 find mid
  Node mid = findMid(head);
  //step2 = reverse 2nd half
  Node prev = null;
  Node curr = mid;
  Node next;
  while(curr != null){
   next = curr.next;
   curr.next = prev;
   prev = curr;
   curr = next;
  }
  Node right = prev;
  Node left = head;
  
  //step3 - check left and right half
  while (right !=null && left!=null) {
    if(left.data != right.data){
     return false;
    }
    left = left.next;
    right = right.next;
  }
  return true;
 }
 public static void main(String[] args) {
  Palindrome ll = new Palindrome();
  ll.addFirst(1);
  ll.addFirst(2);
  ll.addFirst(2);
  ll.addFirst(1);
  ll.addFirst(2);
  ll.print();
  System.out.println(ll.checkPalindrome());
 }

}
