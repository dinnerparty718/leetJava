package dataStructure.linkedList;

public class HasCycle {

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }

    ListNode slow = head;

    ListNode fast = head;

    while (fast != null && fast.next != null) {
      
      fast = fast.next.next;
      slow = slow.next;


      if(fast == slow){
        return true;
      }

      // end condition fast reach the end
    }

    return false;
  }
}
