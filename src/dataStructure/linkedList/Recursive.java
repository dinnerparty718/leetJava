package dataStructure.linkedList;

public class Recursive {

  MyListNode head;

  public void printRecursive(MyListNode head) {
    if (head == null) return;
    printRecursive(head.next);
    System.out.println(head.val);
  }

  public void reverse(MyListNode p) {
    if (p.next == null) {
      head = p;
      return;
    }

    reverse(p.next);

    p.next.next = p;
    p.next = null;
  }

  public MyListNode reverse2(MyListNode head) {
    if (head.next == null || head == null) { // in case passing an empty list
      return head;
    }

    MyListNode p = reverse2(head.next);

    head.next.next = head;
    head.next = null;
    return p;
  }

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.addAtTail(1);
    list.addAtTail(2);
    list.addAtTail(3);
    list.addAtTail(4);

    System.out.println(list);

    Recursive solution = new Recursive();

    // solution.printRecursive(list.getNode(0));

    MyListNode p = solution.reverse2(list.getNode(0));

    while (p != null) {
      System.out.println(p.val);
      p = p.next;
    }
  }
}
