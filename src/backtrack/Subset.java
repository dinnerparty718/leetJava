package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// how many possible subsets   Pow(2, n)
//  [ null, null , null ]   take or not taken
//  [ 1   , null , null ]
//  [ 1   , 2    , null ]
//  [ 1   , 2    , 3    ]

public class Subset {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
  }

  private void backtrack(
    List<List<Integer>> list,
    List<Integer> tempList,
    int[] nums,
    int start
  ) {
    list.add(new ArrayList<>(tempList)); //make a copy of the current list

    // System.out.println("tempList " + tempList.toString());

    for (int i = start; i < nums.length; i++) {
      tempList.add(nums[i]); // taken
      backtrack(list, tempList, nums, i + 1);
      tempList.remove(tempList.size() - 1); // not taken
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };

    Subset solution = new Subset();

    List<List<Integer>> result = solution.subsets(nums);

    for (List<Integer> i : result) {
      System.out.println(i.toString());
    }
  }
}
