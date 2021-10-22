package backtrack;

import java.util.ArrayList;


public class Solution {

  private void backtrack(
    ArrayList<ArrayList<Integer>> result,
    int[] nums,
    ArrayList<Integer> tmp,
    int start
  ) {
    for (int i = start; i < nums.length; i++) {
      tmp.add(nums[i]);
      backtrack(result, nums, tmp, i + 1);
      tmp.remove(tmp.size() - 1);
    }

    result.add(new ArrayList<>(tmp));// clone
  }

  public static void main(String[] args) {
    int[] input = { 1, 2, 3 };

    // Integer[] tmp = new Integer[input.length];

    ArrayList<Integer> tmp = new ArrayList<>();

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    Solution so = new Solution();

    so.backtrack(result, input, tmp, 0);
    // System.out.println(Arrays.toString(tmp));

    for (ArrayList<Integer> list : result) {
      System.out.println(list.toString());
    }
  }
}
