package dataStructure.array;

public class SpiralMatrixIII {

  public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
    int[][] result = new int[rows * cols][2];

    int top = rStart;
    int bottom = rStart;
    int left = cStart;
    int right = cStart;

    int index = 0;

    result[index] = new int[] { rStart, cStart };

    int[] current = result[index];
    index++;


    while (index < rows * cols) {
      // move right

      right++;

      for (int col = current[1] + 1; col <= right; col++) {
        if (col <= cols - 1 && col >= 0 && top >= 0) {
          result[index++] = new int[] { top, col };
        }
      }

      current = new int[] { current[0], right };

      bottom++;

      for (int row = current[0] + 1; row <= bottom; row++) {
        if (row <= rows - 1 && row >= 0 && right <= cols - 1) {
          result[index++] = new int[] { row, right };
        }
      }

      current = new int[] { bottom, current[1] };

      left--;

      for (int col = current[1] - 1; col >= left; col--) {
        if (col >= 0 && col <= cols - 1 && bottom <= rows - 1) {
          result[index++] = new int[] { bottom, col };
        }
      }

      current = new int[] { current[0], left };

      top--;

      for (int row = current[0] - 1; row >= top; row--) {
        if (row >= 0 && row <= rows - 1 && left >= 0) {
          result[index++] = new int[] { row, left };
        }
      }

      current = new int[] { top, current[1] };

    }

    return result;
  }



  public static void main(String[] args) {
    int rows = 1;
    int cols = 4;
    int rStart = 0;
    int cStart = 0;

    SpiralMatrixIII solution = new SpiralMatrixIII();

    int[][] result = solution.spiralMatrixIII(rows, cols, rStart, cStart);

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i][0] + ", " + result[i][1]);
    }
    // ArrayList<int[]> list = new ArrayList<>();

    // list.add(new int[] { 0, 1 });
    // list.add(new int[] { 0, 1 });
    // list.add(new int[] { 0, 1 });
  }
}
