package dataStructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDiagonalOrder {

  public int[] findDiagonalOrder(int[][] mat) {
    int N = mat.length;
    int M = mat[0].length;

    Map<Integer, ArrayList<Integer>> dict = new HashMap<>();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        int sum = i + j;

        if (!dict.containsKey(sum)) {
          ArrayList<Integer> arrList = new ArrayList<>();
          arrList.add(mat[i][j]);
          dict.put(sum, arrList);
        } else {
          dict.get(sum).add(mat[i][j]);
        }
      }
    }

    int[] output = new int[N * M];

    int index = 0;

    for (Map.Entry<Integer, ArrayList<Integer>> nums : dict.entrySet()) {
      // System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());

      boolean goUp = nums.getKey() % 2 == 1;

      ArrayList<Integer> values = nums.getValue();

      if (goUp) {
        for (int i = 0; i < values.size(); i++) {
          output[index] = values.get(i);
          index++;
        }
      } else {
        for (int i = values.size() - 1; i >= 0; i--) {
          output[index] = values.get(i);
          index++;
        }
      }
    }

    return output;
  }

  public static void main(String[] args) {
    int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    FindDiagonalOrder solution = new FindDiagonalOrder();

    int[] output = solution.findDiagonalOrder(input);

    for (int n : output) {
      System.out.println(n);
    }
  }
}
