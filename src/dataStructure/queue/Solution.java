package dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public static void main(String[] args) {
    Queue<Integer> myQ = new LinkedList<>();

    myQ.add(1);
    myQ.add(2);

    System.out.println(myQ.toString());
    myQ.poll();
    System.out.println(myQ.toString());
    myQ.poll();
    System.out.println(myQ.toString());

    char[] list = { 'a', 'b', 'c' };

    System.out.println(new String(list));

    StringBuffer s = new StringBuffer("Geeksfor");
    s.trimToSize();
    System.out.println(s.capacity());
  }
}
