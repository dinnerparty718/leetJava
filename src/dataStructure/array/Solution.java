package dataStructure.array;

public class Solution {

  public int pivotIndex(int[] nums) {
    int leftResult = 0;
    int rightResult = 0;

    for (int i = nums.length - 1; i > 0; i--) {
      rightResult += nums[i];
    }

    if (rightResult == leftResult) {
      return 0;
    }

    for (int i = 1; i < nums.length; i++) {
      leftResult += nums[i - 1];

      rightResult -= nums[i];

      if (leftResult == rightResult) {
        return i;
      }
    }

    return -1;
  }

  public int dominantIndex(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int maxIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxIndex = i;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (i != maxIndex && nums[i] != 0 && nums[maxIndex] / nums[i] < 2) {
        return -1;
      }
    }

    return maxIndex;
  }

  // large integer
  public int[] plusOne(int[] digits) {
    for (int i = 0; i < digits.length; i++) {}

    return new int[] {};
  }

  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 1 };
    Solution s = new Solution();
    System.out.println(s.plusOne(nums));
  }
}
