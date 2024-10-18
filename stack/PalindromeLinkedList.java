
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next == null){
        return true;
       }
      Stack<Integer> s = new Stack<>();
      ListNode slow = head;
      ListNode fast = head;
      while (fast!=null && fast.next!=null) {
         s.push(slow.val);
         slow = slow.next;
         fast = fast.next;
      } 
      //if size is odd
      if(fast!=null){
        slow = slow.next;
      }
      while (slow!=null) {
        if(slow.val!=s.pop()){
            return false;
        }
        slow = slow.next;
      }
      return true;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        

        PalindromeLinkedList solution = new PalindromeLinkedList();
        boolean isPalindrome = solution.isPalindrome(head);
        System.out.println(isPalindrome);
    }
}