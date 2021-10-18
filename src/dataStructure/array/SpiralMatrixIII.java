package dataStructure.array;

public class SpiralMatrixIII {

  public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
    int[][] result = new int[][] { { 0, 0 }, { 0, 1 } };

    return result;
  }

  public static void main(String[] args) {
    int rows = 1;
    int cols = 4;
    int rStart = 0;
    int cStart = 0;

    SpiralMatrixIII solution = new SpiralMatrixIII();

    int[][] result = solution.spiralMatrixIII(rows, cols, rStart, cStart);

    for (int[] res : result) {
      System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
  }
}
