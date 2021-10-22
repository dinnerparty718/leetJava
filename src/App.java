import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    List<Integer> al = new ArrayList<>();

    al.add(10);
    al.add(20);
    al.add(30);
    al.add(1);
    al.add(2);

    al.add(0, 4);

    // System.out.println(al.size());
    System.out.println(al.toString());
  }
}
