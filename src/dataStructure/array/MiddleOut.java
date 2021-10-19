package dataStructure.array;

public class MiddleOut {

  public int[][] generateMatrix(int n) {
    int[][] result = new int[][] { { 1, 1 }, { 2, 2 } };
    return result;
  }

  public static void main(String[] args) {
    int n = 3;

    MiddleOut solution = new MiddleOut();

    int[][] result = solution.generateMatrix(n);

    for (int i = 0; i < result.length; i++) {
      StringBuilder s = new StringBuilder();

      for (int j = 0; j < result[0].length; j++) {
        s.append(result[i][j] + "\t");
      }
      System.out.println(s);
    }
  }
}
