package recursion;

import java.util.Arrays;

// print reverse
public class reverseString {

  // private static void printReverse(char[] str) {
  //   helper(0, str);
  // }

  // private static void helper(int i, char[] str) {
  //   if (i > str.length - 1) {
  //     return;
  //   }

  //   helper(i + 1, str);
  //   System.out.println(str[i]);
  // }

  private static char[] reverse(char[] str) {
    StringBuilder sb = new StringBuilder();

    helper2(0, str, sb);

    return sb.toString().toCharArray();
  }

  private static void helper2(int i, char[] str, StringBuilder result) {

    if(i > str.length - 1 ){
      return;
    }

    helper2(i+1,str, result);

    result.append(str[i]);
  }

  public static void main(String[] args) {
    // reverseString.printReverse("12345".toCharArray());


    System.out.println(Arrays.toString(reverseString.reverse("12345".toCharArray())));
  }
}
