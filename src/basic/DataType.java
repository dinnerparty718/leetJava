package basic;

public class DataType {

  public static void main(String[] args) {
    // 1 byte = 8 bit  2^7
    // System.out.println(Math.pow(2, 7));

    byte a = (byte) 0b0001_1100; //    28
    byte b = (byte) 0b1110_0100; //   -28

    String c = "hello";

    System.out.println(c.charAt(0));
    // System.out.println(a);
    // System.out.println(b);

    // System.out.println();
  }
}
