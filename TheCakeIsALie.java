import java.util.Scanner;

public class TheCakeIsALie {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int m = scn.nextInt();
      int k = scn.nextInt();
      int[][] dp = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (i == 0 && j == 0) {
            continue;
          } else if (i == 0) {
            dp[i][j] = dp[i][j - 1] + 1;
          } else if (j == 0) {
            dp[i][j] = dp[i - 1][j] + 1;
          } else {
            dp[i][j] = dp[i - 1][j] + (j + 1);
          }
        }
      }

      if (dp[n - 1][m - 1] == k) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    scn.close();
  }
}
