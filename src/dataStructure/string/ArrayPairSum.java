package dataStructure.string;

import java.util.Arrays;

public class ArrayPairSum {

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);

    int sum = 0;

    for (int i = 0; i < nums.length; i = i + 2) {
      sum += nums[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] input = { 6, 2, 6, 5, 1, 2 };

    ArrayPairSum solution = new ArrayPairSum();

    int result = solution.arrayPairSum(input);

    System.out.println(result);
  }
}
