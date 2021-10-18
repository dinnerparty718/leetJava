package dataStructure.array;

public class GenerateMatrix {

  public int[][] generateMatrix(int n) {
    int num = 1;

    int left = 0;
    int top = 0;

    int right = n - 1;
    int bottom = n - 1;

    int[][] result = new int[n][n];

    while (left <= right && top <= bottom) {
      // left -> right
      for (int col = left; col <= right; col++) {
        result[top][col] = num++;
      }

      top++;

      // top -> down
      for (int row = top; row <= bottom; row++) {
        result[row][right] = num++;
      }

      right--;

      // right -> left  make sure it's not the same row

      if (top <= bottom) {
        for (int col = right; col >= left; col--) {
          result[bottom][col] = num++;
        }
      }
      bottom--;

      if (left <= right) {
        for (int row = bottom; row >= top; row--) {
          result[row][left] = num++;
        }
      }

      left++;
    }

    return result;
  }

  public static void main(String[] args) {
    int n = 4;

    GenerateMatrix solution = new GenerateMatrix();
    int[][] result = solution.generateMatrix(n);

    for (int i = 0; i < n; i++) {
      StringBuilder s = new StringBuilder();

      for (int j = 0; j < n; j++) {
        s.append(result[i][j] + "\t");
      }

      System.out.println(s);
    }
  }
}
