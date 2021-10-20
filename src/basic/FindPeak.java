package basic;

// return index

public class FindPeak {

  // any peak
  public int findPeakElementLinearScan(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        return i;
      }
    }

    return nums.length - 1;
  }

  // find the last peak left ->
  public int findPeakElementLinearScan2(int[] nums) {
    int i = 1;
    int lastIdx = -1;

    while (i < nums.length) {
      if (nums[i] > nums[i - 1]) {
        lastIdx = i;
      }
      i++;
    }

    // array is in DESC order
    if (lastIdx == -1) {
      return 0;
    }

    return lastIdx;
  }

  // any peak
  public int findPeakElementBinarySearch(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] < nums[mid + 1]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

  public static void main(String[] args) {
    int[] input = { 1, 2, 1, 3, 5, 6, 4 };

    FindPeak solution = new FindPeak();

    int result = solution.findPeakElementLinearScan2(input);

    System.out.println(result);
  }
}
