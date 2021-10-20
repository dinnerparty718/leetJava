package dataStructure.string;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while(strs[i].indexOf(prefix)!=0){
        prefix = prefix.substring(0, prefix.length()- 1);

        if(prefix.isEmpty()){
          return "";
        }

      }



    }

    return prefix;
  }

  public static void main(String[] args) {
    LongestCommonPrefix solution = new LongestCommonPrefix();

    String[] input = { "flower", "flow", "flight" };
    String result = solution.longestCommonPrefix(input);

    String a = "ab";

    String b = "abcc";

    System.out.println(a.indexOf(b));

    System.out.println(result);
  }
}
