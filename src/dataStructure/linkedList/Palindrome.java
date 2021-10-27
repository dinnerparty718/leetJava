package dataStructure.linkedList;

public class Palindrome {

  public boolean isPalindrome(MyListNode head) {
    if (head == null || head.next == null) return true;

    int size = 0;

    MyListNode p = head;

    while (p != null) {
      p = p.next;
      size += 1;
    }

    int idx1;
    int idx2;

    if (size % 2 == 0) {
      idx1 = (size - 1) / 2;
      idx2 = idx1 + 1;
    } else {
      idx1 = (size - 1) / 2 - 1;
      idx2 = idx1 + 2;
    }

    // System.out.println("reverse from  " + idx1 + " comparing from   " + idx2);

    //travse again

    int index = 0;

    p = head;

    MyListNode p2 = null;

    while (p != null) {
      if (index == idx1) {
        p2 = p;
      }

      if (index == idx2) {
        break;
      }

      p = p.next;

      index += 1;
    }

    // System.out.println(p2.val);

    // System.out.println(p.val);

    p2.next = null;

    p2 = reverse(p2);

    // System.out.println(p2.val);

    while (p2 != null) {
      if (p2.val != p.val) {
        return false;
      }

      p2 = p2.next;
      p = p.next;
    }

    return true;
  }

  public MyListNode reverse(MyListNode head) {
    if (head.next == null) {
      return head;
    }

    MyListNode p = reverse(head.next);

    head.next.next = head;
    head.next = null;

    return p;
  }

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.addAtTail(1);
    // list.addAtTail(2);
    // list.addAtTail(3);
    // list.addAtTail(2);
    // list.addAtTail(1);

    System.out.println(list);

    Palindrome solution = new Palindrome();

    boolean result = solution.isPalindrome(list.getNode(0));

    System.out.println(result);
  }
}
