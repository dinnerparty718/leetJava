package dataStructure.linkedList;

class ListNode {

  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class Reverse {

  public ListNode reverseList(ListNode head) {
    ListNode dummy = new ListNode(0);

    dummy.next = head;

    while (head != null && head.next != null) {
      ListNode p = head.next;
      head.next = p.next;
      p.next = dummy.next;
      dummy.next = p;
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    Reverse solution = new Reverse();

    System.out.println(solution.reverseList(null));
  }
}
