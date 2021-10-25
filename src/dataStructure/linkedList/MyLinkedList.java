package dataStructure.linkedList;

// singly linked list
public class MyLinkedList {

  MyListNode head;

  int size = 0;

  public MyLinkedList() {
    this.head = new MyListNode(0);
  }

  public int get(int index) {
    if (index > this.size - 1) {
      System.out.println("out of bound");
      return -1;
    }

    MyListNode curr = this.head;

    for (int i = 0; i < index + 1; i++) {
      curr = curr.next;
    }

    return curr.val;
  }

  public MyListNode getNode(int index) {
    if (index > this.size - 1) {
      System.out.println("out of bound");
      return null;
    }

    MyListNode curr = this.head;

    for (int i = 0; i < index + 1; i++) {
      curr = curr.next;
    }

    return curr;
  }

  public void addAtHead(int val) {
    this.addAtIndex(0, val);
  }

  public void addAtTail(int val) {
    this.addAtIndex(this.size, val);
  }

  public void addAtIndex(int index, int val) {
    if (index > this.size) {
      System.out.println("index greater than size");
      return;
    }

    MyListNode pred = head;

    // find the pred
    for (int i = 0; i < index; i++) {
      pred = pred.next;
    }

    MyListNode node = new MyListNode(val);

    node.next = pred.next;

    pred.next = node;

    this.size += 1;
  }

  public void deleteAtIndex(int index) {
    if (index > this.size - 1) {
      System.out.println("out of bound");
      return;
    }

    // find pre

    System.out.println("delete item at index " + index);

    MyListNode pred = this.head;

    for (int i = 0; i < index; i++) {
      pred = pred.next;
    }

    pred.next = pred.next.next;

    this.size -= 1;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Size " + this.size + "\n");

    sb.append("head");

    MyListNode curr = head;

    while (curr.next != null) {
      curr = curr.next;
      sb.append(" -> " + curr.val);
    }

    return sb.toString();
  }

  public MyListNode getHead() {
    return this.head;
  }

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.addAtIndex(0, 9);
    list.addAtIndex(0, 8);
    list.addAtHead(7);
    list.addAtHead(11);
    list.addAtTail(999);

    System.out.println(list);

    System.out.println(list.get(4));
    list.deleteAtIndex(1);

    System.out.println(list);
  }
}

class MyListNode {

  int val;
  MyListNode next;

  public MyListNode(int val) {
    this.val = val;
  }
}
