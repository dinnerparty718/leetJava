package dataStructure.array;

public class SpiralMatrixIII {

  public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
    int[][] result = new int[rows * cols][2];

    int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    int top = rStart;
    int bottom = rStart;
    int left = cStart;
    int right = cStart;

    int index = 0;

    int r = 1;

    result[index] = new int[] { rStart, cStart };

    int[] current = result[index];
    index++;

    // arrayToString(current);

    while (index < rows * cols) {
      // move right

      right++;

      for (int col = current[1] + 1; col <= right && col <= cols - 1; col++) {
        result[index++] = new int[] { top, col };
      }

      current = result[index - 1];

      // arrayToString(current);

      bottom++;

      for (int row = current[0] + 1; row <= bottom && row <= rows - 1; row++) {
        if (right <= cols - 1) {
          result[index++] = new int[] { row, right };
        }
      }

      current = result[index - 1];

      left--;

      // for(int col = )

      // arrayToString(current);

      // result[index++] = new int[] { rStart, cStart };

      break;
      // end condition index === rows
    }

    return result;
  }

  private void arrayToString(int[] input) {
    System.out.println("[ " + input[0] + ", " + input[1] + " ]");
  }

  public static void main(String[] args) {
    int rows = 5;
    int cols = 6;
    int rStart = 1;
    int cStart = 4;

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
