class Solution {
  public static int longLIS(int[] nums) {
    int size = nums.length;
    int[] ansUpto = new int[size];
    ansUpto[0] = 1;
    for (int i = 1; i < size; i += 1) {
      for (int j = 0; j < i; j += 1) {
        ansUpto[i] = Math.max(ansUpto[i], ansUpto[j]);
        if (nums[j] < nums[i]) {
          ansUpto[i] = Math.max(ansUpto[i], ansUpto[j] + 1);
        }
      }
    }
    return ansUpto[size - 1];
  }

  public static void main(String[] args) {
    int[] check = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
    System.out.print(longLIS(check));
  }

  // code for 4 key keyboard
public static int maxContent(int n) {
  int[] maxVals = new int[n+1];
  for (int i=1; i<=n; i+=1) {
    maxVals[i] = maxVals[i-1] + 1;
    for (int j=2; j<i; j+=1) {
      maxVals[i] = Math.max(maxVals[i], maxVals[j-1]*(i-j+1));
    }
  }
  return maxVals[n];
}
}
