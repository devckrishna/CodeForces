import java.util.Scanner;

public class FedorAndNewGame {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int m = scn.nextInt(), k = scn.nextInt();
    int ans = 0;
    int[] a = new int[m + 1];
    for (int i = 0; i <= m; i++) {
      a[i] = scn.nextInt();
    }
    for (int i = 0; i < m; i++) {
      int diff = Integer.bitCount(a[i] ^ a[m]);
      if (diff <= k) {
        ans++;
      }
    }
    System.out.println(ans);

    scn.close();
  }
}