package dataStructure.string;

import java.util.Arrays;

public class Concat {

  public static void main(String[] args) {
    String s = "hello World";
    String s2 = "java";

    char[] chars = s.toCharArray();

    System.out.println(Arrays.toString(chars));

    System.out.println(String.format("testing %s %s %f", s, s2, 2f));
  }
}
