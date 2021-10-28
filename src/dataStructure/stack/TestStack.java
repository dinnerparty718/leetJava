package dataStructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestStack {

  public static void main(String[] args) {
    Stack<Integer> myStack = new Stack<>();

    myStack.push(1);

    // System.out.println(myStack);

    myStack.pop();

    System.out.println(myStack);

    if (myStack.isEmpty()) {
      System.out.println("stack is empty");
    }

    List<Integer> list = new ArrayList<>();
    list.add(1);
    // list.add(null);

    System.out.println(list.remove(null));
    System.out.println(list);


    List<List<Integer>> ad = new ArrayList<>();
    System.out.println(ad.size());

  }
}
