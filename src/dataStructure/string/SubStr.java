package dataStructure.string;

public class SubStr {

  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }

    int i = 0;

    while (i < haystack.length()) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        // there is enough size to match
        if (i + needle.length() > haystack.length()) {
          return -1;
        }

        boolean match = true;

        for (int j = 0; j < needle.length(); j++) {
          if (haystack.charAt(i + j) != needle.charAt(j)) {
            match = false;
            continue;
          }
        }

        if (match) {
          return i;
        }
      }

      // continue to search
      i++;
    }

    return -1;
  }

  public static void main(String[] args) {
    SubStr solution = new SubStr();
    String haystack = "aaa";
    String needle = "aaaa";

    int result = solution.strStr(haystack, needle);

    System.out.println(result);
  }
}
