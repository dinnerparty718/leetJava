package dataStructure.array;

/*
  https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/

  LARGE integer, can't convert to number;
*/
public class PlusOne {

  // large integer
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      digits[i] = digits[i] + 1;
      if (digits[i] == 10) {
        digits[i] = 0;
      } else {
        return digits;
      }
    }

    // we're here because all the digits are nines
    digits = new int[digits.length + 1];

    for (int n : digits) {
      System.out.println(n);
    }

    digits[0] = 1;

    return digits;
  }

  public static void main(String[] args) {
    int[] inputs = { 9, 9, 9, 9, 9 };

    PlusOne solution = new PlusOne();

    int[] output = solution.plusOne(inputs);

    for (int o : output) {
      System.out.print(o + ", ");
    }
  }
}
