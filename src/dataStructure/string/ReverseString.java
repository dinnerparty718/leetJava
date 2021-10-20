package dataStructure.string;

import java.util.Arrays;

public class ReverseString {

  public void reverseString(char[] s) {

    int left = 0;
    int right = s.length - 1;

    while(left < right){

      // swap 

      char tmp = s[left];
      s[left] = s[right];
      s[right] = tmp;

      left++;
      right--;
    }



  }





  public static void main(String[] args) {
    ReverseString solution = new ReverseString();

    char[] s = { 'h', 'e', 'l', 'l', 'o' };

    solution.reverseString(s);

    System.out.println(Arrays.toString(s));
  }
}
