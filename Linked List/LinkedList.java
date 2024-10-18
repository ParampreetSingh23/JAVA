

public class LinkedList {
  public static class Node {
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data){
      //step 1 create new node
      Node newNode = new Node(data);
      size++;
    if(head == null){
       head = tail = newNode;
       return;
    }
  
    //step 2 newNode next = head
    newNode.next = head;
    //step 3 head = newNode
    head = newNode;
 
  }
  public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
      head  = tail = newNode;
      return;
    }
    
    tail.next = newNode;
    tail = newNode;
    
  }
  public void print(){
    
    if(head==null){
      System.out.println("Linked list is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public void add(int idx,int data){
    if(idx == 0){
      addFirst(data);
    }
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;
    while (i<idx-1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    size++;
  }
  public void removeFirst(){
    if(size==0){
      System.out.println("Empty");
      
    }else if(size==1){
      head = tail = null;
    }
    size--;
    head = head.next;
  }
  public void removeLast(){
    if(size==0){
      System.out.println("Empty");
      
    }else if(size==1){
      head = tail = null;
      size =0;
    }
   Node prev = head;
   for(int i = 0;i<size-2;i++){
     prev = prev.next;
   }
   prev.next = null;
   tail = prev;
   size--;
  }
  public int search(int key){
    Node temp = head;
    for(int i = 0;i<size;i++){
      if(temp.data == key){
        return i;
      
      }
      temp = temp.next;

    }
    return -1;
  }
  public int helper(Node head,int key){
    if(head==null){
      return -1;
    }
    if(head.data == key){
      return 0;
    }
    int idx = helper(head.next, key);
    if(idx == -1){
      return -1;
    }
    return idx+1;
  }
  public int searchRecursive(int key){
    return helper(head, key);
  }
  public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while(curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr= next;
    }
    head = prev;
  }
  public void deleteNthFromEnd(int n){
    //calculate size of linked list
    int sz = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      sz++;
    }
    if(n==sz){
      head = head.next; // remove first
    }
    //sz-n
    int i = 1;
    int iToFind = sz-n;
    Node prev = head;
    while(i<iToFind){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
  }
  public  static boolean isCycle(){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next !=null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
  }
  public static void removeCycle(){
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast!=null && fast.next !=null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
       cycle = true;
        break;
      }
    }
    if(cycle == false){
      return;
    }
    //find meeting point
    slow = head;
    Node prev = null;
    while(slow!=fast){
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }
    //remove 
    prev.next = null;
  }
  private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast  = fast.next.next;
    }
    return slow;
  }
  private Node merge(Node head1,Node head2){
    Node megeredLL = new Node(-1);
    Node temp = megeredLL;
    while (head1!=null && head2 != null) {
        if(head1.data <= head2.data){
          temp.next = head1;
          head1 = head1.next;
          temp = temp.next;
        }else{
          temp.next = head2;
          head2 = head2.next;
          temp = temp.next;
        }
    }
    while (head1!=null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }
    while (head2!=null) {
      temp.next = head2;
          head2 = head2.next;
          temp = temp.next;
    }
  return megeredLL.next;
  }
  public Node mergeSort(Node head){
    if(head==null||head.next==null){
      return head;
    }
    //find mid
    Node mid = getMid(head);
    //left and right
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft =mergeSort(head);
    Node newRight = mergeSort(rightHead);
    //merge
    return merge(newLeft,newRight);
  }
  public void zigZag(){
    //find mid
    Node slow = head;
    Node fast = head.next;
    while (fast!=null && fast.next !=null) {
      slow = slow.next;
      fast = fast.next.next;
    } 
    Node mid = slow;
    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr!=null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL ,nextR;
    //alt merge -zig zag merge
    while(left != null && right !=null){
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;
      left = nextL;
      right = nextR;
    }
  }
  //insert using recursion
  public void insertRec(int val,int index){
     head = insertRec(val, index, head);
  }
  private Node insertRec(int val,int index,Node curr){
    if(index==0){
      Node temp = new Node(val);
      temp = curr;
      size++;
      return temp;
    }
    curr.next = insertRec(val, index, curr.next);
    return curr;
  }
  public void removeDuplicate(){
    if (head == null) return;  // Handle empty list case
    
    Node temp = head;
    while (temp != null && temp.next != null) {
        if (temp.data == temp.next.data) {
            temp.next = temp.next.next;
            size--;
        } else {
            temp = temp.next;
        }
    }
    
    // Update tail
    tail = head;
    while (tail.next != null) {
        tail = tail.next;
    }}
    public static LinkedList mergeTwoLinkedList(LinkedList first, LinkedList second) {
      Node f = first.head;
      Node s = second.head;
      LinkedList ans = new LinkedList();
  
      while (f != null && s != null) {
          if (f.data < s.data) {
              ans.addLast(f.data);
              f = f.next;
          } else {
              ans.addLast(s.data);
              s = s.next;
          }
      }
      while (f != null) {
          ans.addLast(f.data);
          f = f.next;
      }
      while (s != null) {
          ans.addLast(s.data);
          s = s.next;
      }
      return ans;
  }
  public boolean hasCycle(){
    Node fast = head;
    Node slow = head;
    while (fast!=null && fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
  }
  // public int cycleLength(){
  //   Node fast = head;
  //   Node slow = head;
  //   int length = 0;
  //   while (fast!=null && fast.next!=null) {
  //     slow = slow.next;
  //     fast = fast.next.next;
  //     if(slow == fast){
  //     }
  //   }
  //   while (slow!=fast) {
  //     slow = slow.next;
  //     length++;
  //   }
  // }
  public static boolean happyNumber(int n){
    int slow = n;
    int fast = n;
   do {
      slow = square(slow);
      fast = square(square(fast));
   } while (slow!=fast);
   if(slow==1){
    return true;
   }
   return false;
  }
  private static int square(int num){
    int ans = 0;
    while (num>0) {
        int rem = num%10;
        ans+= rem*rem;
        num = num/10;
    }
    return ans;
  }
  public Node mid(){
    Node slow = head;
    Node fast = head;
    while (fast!=null && fast.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
  }
  public static void main(String[] args) {
    LinkedList first = new LinkedList();
    LinkedList second = new LinkedList();
    first.addFirst(1);
    first.addLast(3);
    first.addLast(5);

    second.addFirst(1);
    second.addLast(2);
    second.addLast(4);

    // LinkedList ans = LinkedList.mergeTwoLinkedList(first, second);
    // ans.print();
   System.out.println(happyNumber(19));

    
  }
}
