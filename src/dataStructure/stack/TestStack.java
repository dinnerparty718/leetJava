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
  }
}
