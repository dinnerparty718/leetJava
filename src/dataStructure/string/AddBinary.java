package dataStructure.string;

import java.math.BigInteger;

// todo use charAt(i)
// todo optimized
// Bit-by-Bit Computation
public class AddBinary {

  // bit manipulation
  // while( carry > 0)
  //  1.  && calculate carry
  //  2.  XOR simuliate add and store in a
  //  3   carry << 1
  //      result = a

  public String addBinary2(String a, String b) {
    BigInteger x = new BigInteger(a, 2);
    BigInteger y = new BigInteger(b, 2);

    // let y be the carry, x be the result

    BigInteger carry;
    BigInteger answer; // tmp value
    BigInteger zero = new BigInteger("0", 2);

    while (y.compareTo(zero) != 0) {
      answer = x.xor(y);
      carry = x.and(y).shiftLeft(1);
      y = carry;
      x = answer;
    }

    return x.toString(2);
  }

  // integer
  public String addBinary3(String a, String b) {
    Integer x = Integer.valueOf(a, 2);
    Integer y = Integer.valueOf(b, 2);

    int carry;
    int tmp;

    while (y != 0) {
      carry = (x & y) << 1;
      tmp = x ^ y;
      y = carry;
      x = tmp;
    }

    return Integer.toString(x, 2);
  }

  public String addBinary(String a, String b) {
    int length = Math.max(a.length(), b.length());

    int lengthDif = Math.abs(a.length() - b.length());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < lengthDif; i++) {
      sb.append("0");
    }

    char[] _a;
    char[] _b;

    if (a.length() < length) {
      _a = sb.append(a).toString().toCharArray();
      _b = b.toCharArray();
    } else {
      _a = a.toCharArray();
      _b = sb.append(b).toString().toCharArray();
    }

    int[] result = new int[_a.length];

    int carry = 0;

    for (int i = _a.length - 1; i >= 0; i--) {
      int aValue = Character.getNumericValue(_a[i]);
      int bValue = Character.getNumericValue(_b[i]);

      int sum = aValue + bValue + carry;

      if (sum <= 1) {
        result[i] = sum;
        carry = 0;
      } else if (sum == 2) {
        result[i] = 0;
        carry = 1;
      } else {
        // sum ==3
        result[i] = 0;
        carry = 1;
      }
    }

    sb = new StringBuilder();

    if (carry == 1) {
      sb.append("1");
    }

    for (int c : result) {
      sb.append(c);
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    AddBinary solution = new AddBinary();
    String a = "1010";
    String b = "1011";

    System.out.println(solution.addBinary2(a, b));
  }
}
