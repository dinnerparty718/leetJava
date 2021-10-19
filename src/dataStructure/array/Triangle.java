package dataStructure.array;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> subList = new ArrayList<>();

      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          subList.add(1);
        } else {
          // subList.add(0);
          List<Integer> prevRow = result.get(i - 1);
          subList.add( prevRow.get(j-1) + prevRow.get(j) );
        }
      }

      result.add(subList);
    }

    return result;
  }

  public static void main(String[] args) {
    Triangle solution = new Triangle();

    int numRows = 5;
    List<List<Integer>> list = solution.generate(numRows);


    System.out.println(list.toString());

    // for (List<Integer> l : list) {
    //   System.out.println(l.toString());
    // }
  }
}
