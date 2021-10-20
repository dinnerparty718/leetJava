package basic;

public class Binary {

  String decimalToBinary(int a) {
    if (a == 0) {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    while (a > 0) {
      int remainder = a % 2;

      sb.append(remainder + "");
      a = a >> 1; // right shift 1 bit , divide by 2   // left shift by 1 , multiply by 2
    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    //built-in function
    // int a = 7; // 111  bitcount3

    // Binary solution = new Binary();

    System.out.println(Integer.toBinaryString(0));
  }
}
