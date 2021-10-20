package basic;

import java.util.Arrays;

public class FindNextPermutation {

  public void nextPermutation(int[] nums) {
    // find the next peak;

    int n = nums.length;
    int peakIdx = -1;
    int i = 1;

    while (i < n) {
      if (nums[i] > nums[i - 1]) {
        peakIdx = i;
      }
      i++;
    }

    // array is in descending order
    if (peakIdx == -1) {
      System.out.println("array is in descending order");
      this.reverseArray(nums, 0, nums.length - 1);
      return;
    }
    // check if any values to the right of the peak greater than the left value [1, 2, 3, 5, 4, 2]

    int possible = -1;

    if (peakIdx != nums.length - 1) {
      for (int j = peakIdx + 1; j < nums.length; j++) {
        if (nums[j] > nums[peakIdx - 1]) {
          possible = j;
        }
      }
    }

    if (possible == -1) {
      //swap peak and previous

      this.swap(nums, peakIdx, peakIdx - 1);
    } else {
      // speacial case
      // swap possible and previous
      this.swap(nums, possible, peakIdx - 1);
    }
    // fort item after peak

    this.reverseArray(nums, peakIdx, nums.length - 1);
  }

  public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  public void reverseArray(int[] nums, int start, int end) {

    while (start < end) {
      int tmp = nums[start];
      nums[start] = nums[end];
      nums[end] = tmp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    FindNextPermutation solution = new FindNextPermutation();
    // int[] input = { 1, 2, 1, 3, 5, 6, 4 };
    int[] input = { 1, 3, 2 };

    solution.nextPermutation(input);

    System.out.println(Arrays.toString(input));
  }
}
