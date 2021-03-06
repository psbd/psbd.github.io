class Solution {
  public static int minOps(String str1, String str2) {
    int size1 = str1.length(), size2 = str2.length();
    int[][] minCnt = new int[size1 + 1][size2 + 1];
    // for (int i = 0; i <= size1; i+=1) {
    // minCnt[i][0] = 0;
    // }
    // for (int i = 0; i <= size2; i+=1) {
    // minCnt[0][i] = 0;
    // }

    for (int i = 1; i <= size1; i += 1) {
      for (int j = 1; j <= size2; j += 1) {
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
          minCnt[i][j] = minCnt[i - 1][j - 1] + 1;
        } else {
          minCnt[i][j] = Math.max(minCnt[i - 1][j], minCnt[i][j - 1]);
        }
      }
    }
    return minCnt[size1][size2];

  }

  public static void main(String[] args) {
    System.out.print(minOps("this", "whas"));
  }
}