

public class ll {
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
  public void add(int idx,int data){
    if(idx==0){
      addFirst(data);
    }
    int i = 0;
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    while(i<idx-1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }
  public void print(){
    Node temp = head;
    if(head==null){
      System.out.println("Linked list is empty");
      return;
    }
    while (temp != null) {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public void removeFirst(){
    if(size == 0){
      System.out.println("Empty");
    }
    if(size==1){
      head = tail = null;
    }
    head = head.next;
    size--;
  }
  public void removeLast(){
    if(size == 0){
      System.out.println("Empty");
    }
    if(size==1){
      head = tail = null;
    }
    Node prev = head;
    for(int i = 0 ;i<size-2;i++){
      prev = prev.next;

    }
    prev.next = null;
    tail = prev;
  }
  public void reverse(){
    Node prev = null;
    Node curr = head;
    Node next;
    while(curr!=null){
      next  = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }
    head = prev;
    
  }
  public void removeCycle(){
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast !=  null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        cycle = true;
        break;
      }
    }
    slow = head;
    Node prev = null;
    while(slow!=fast){
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }
    prev.next = null;
  }
  public static void main(String[] args) {
   ll list = new ll();
  //  list.addFirst(1);
  //  list.addLast(5);
  //  list.add(2,4);
  //  list.add(1, 8);
  //  list.add(3, 3);
  //  list.print();
  //   list.reverse();
  //  list.print();
  head = new Node(1);
  Node temp = new Node(2);
  head.next = temp;
  head.next.next = new Node(3);
  head.next.next.next = temp;
}

}
