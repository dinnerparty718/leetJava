package recursion;

import java.util.Arrays;

public class reverseString2 {

  public void reverseString(char[] s) {
    helper(s, 0, s.length - 1);
  }

  private void helper(char[] s, int i, int j) {
    // System.out.println("i " + i + " j " + j);

    if (i == j) {
      return;
    }

    char tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;

    helper(s, i + 1, j - 1);
  }

  public static void main(String[] args) {
    char[] input = "54321".toCharArray();

    reverseString2 solution = new reverseString2();

    solution.reverseString(input);

    System.out.println(Arrays.toString(input));
  }
}
