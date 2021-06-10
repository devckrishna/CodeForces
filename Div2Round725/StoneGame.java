import java.util.Scanner;

public class StoneGame {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int maxIndex = -1;
      int minIndex = -1;
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        int curr = scn.nextInt();
        arr[i] = curr;
        if (curr >= max) {
          max = curr;
          maxIndex = i + 1;
        }
      }
      for (int i = 0; i < n; i++) {
        if (arr[i] <= min) {
          min = arr[i];
          minIndex = i + 1;
        }
      }

      if (minIndex > maxIndex) {
        int temp = maxIndex;
        maxIndex = minIndex;
        minIndex = temp;
      }

      int first = (n - maxIndex + 1) + minIndex;
      int second = maxIndex;
      int third = n - minIndex + 1;
      int ans = Math.min(third, Math.min(first, second));
      System.out.println(ans);
    }

    scn.close();
  }
}