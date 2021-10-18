package dataStructure.array;

import java.util.ArrayList;
import java.util.List;

/*
 * two pointer technique
 *
 *
 */
public class SpiralOrder {

  public List<Integer> spiralOrder(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;

    int left = 0;
    int right = columns - 1;
    int top = 0;
    int bottom = rows - 1;

    ArrayList<Integer> result = new ArrayList<>();

    while (left <= right && top <= bottom) {
      System.out.println("in while");
      // left -> right

      for (int col = left; col <= right; col++) {
        result.add(matrix[top][col]);
      }
      top++;

      // top -> bottom

      for (int row = top; row <= bottom; row++) {
        // System.out.println(matrix[i][right]);
        result.add(matrix[row][right]);
      }
      right--;

      // right -> left

      // make sure it's not the same row
      

      if (top <= bottom) {
        for (int col = right; col >= left; col--) {
          result.add(matrix[bottom][col]);
        }
      }
      bottom--;

      // bottom -> top

      if (left <= right) {
        for (int row = bottom; row >= top; row--) {
          result.add(matrix[row][left]);
        }
      }
      left++;
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

    SpiralOrder solution = new SpiralOrder();

    List<Integer> result = solution.spiralOrder(matrix);

    for (Integer i : result) {
      System.out.println(i);
    }
  }
}
