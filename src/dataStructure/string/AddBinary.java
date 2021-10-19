package dataStructure.string;

// Bit-by-Bit Computation
public class AddBinary {

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

    String a = "0";
    String b = "0";

    String res = solution.addBinary(a, b);

    System.out.println(res);
  }
}
