package dataStructure.doubleLinkedList;

public class MyLinkedList {

  class Node {

    int val;
    Node prev;
    Node next;

    Node(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return this.val + "";
    }
  }

  private int size;
  private Node head;
  private Node tail;

  public MyLinkedList() {
    this.size = 0;
    this.head = new Node(0);
    this.tail = new Node(0);

    this.head.next = this.tail;
    this.tail.prev = this.head;
  }

  public int get(int index) {
    if (index > this.size - 1 || index < 0) {
      System.out.println("out of bound");
      return -1;
    }

    if (index <= this.size / 2) {
      // get from head

      Node curr = this.head;

      for (int i = 0; i <= index; i++) {
        curr = curr.next;
      }
      return curr.val;
    } else {
      // get from tail

      Node curr = this.tail;

      for (int i = this.size; i > index; i--) {
        curr = curr.prev;
      }

      return curr.val;
    }
  }

  public void addAtHead(int val) {
    Node succ = this.head.next;

    Node add = new Node(val);

    add.prev = this.head;
    add.next = succ;

    this.head.next = add;
    succ.prev = add;

    this.size += 1;
  }

  public void addAtTail(int val) {
    Node prev = this.tail.prev;

    Node add = new Node(val);

    add.next = this.tail;
    add.prev = prev;

    prev.next = add;
    this.tail.prev = add;

    this.size += 1;
  }

  public void addAtIndex(int index, int val) {
    if (index > this.size || index < 0) {
      System.out.println("invalid index");
      return;
    }

    // decide whether to add from head or tail;

    if (index <= this.size / 2) {
      // add from head

      Node pred = head;

      for (int i = 0; i < index; i++) {
        pred = pred.next;
      }

      Node succ = pred.next;

      Node add = new Node(val);

      add.prev = pred;
      add.next = succ;

      pred.next = add;
      succ.prev = add;
    } else {
      // add from tail

      Node succ = tail;

      for (int i = this.size - 1; i >= index; i--) {
        succ = succ.prev;
      }

      Node pred = succ.prev;

      Node add = new Node(val);

      add.prev = pred;
      add.next = succ;

      pred.next = add;
      succ.prev = add;
    }

    this.size += 1;
  }

  public void deleteAtIndex(int index) {
    if (index > this.size - 1 || index < 0) {
      return;
    }

    Node curr;

    if (index <= this.size / 2) {
      // get from head

      curr = this.head;

      for (int i = 0; i <= index; i++) {
        curr = curr.next;
      }
    } else {
      // get from tail

      curr = this.tail;

      for (int i = this.size; i > index; i--) {
        curr = curr.prev;
      }
    }

    Node pred = curr.prev;
    Node succ = curr.next;

    pred.next = succ;
    succ.prev = pred;

    this.size -= 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("Size %s \n", this.size));
    sb.append("head -> ");

    Node curr = this.head;
    while (curr.next != null && curr.next != this.tail) {
      curr = curr.next;
      sb.append(curr.val + " -> ");
    }

    sb.append("tail");

    sb.append("\n");

    return sb.toString();
  }

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.addAtIndex(0, 9);
    list.addAtIndex(0, 8);
    list.addAtIndex(0, 7);

    list.addAtIndex(2, 5);

    list.addAtTail(100);
    list.addAtTail(101);

    list.addAtHead(0);

    list.deleteAtIndex(2);

    System.out.println(list);
  }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
