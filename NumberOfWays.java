import java.util.Scanner;

public class NumberOfWays {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    long sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
      sum += arr[i];
    }

    if (sum % 3 != 0) {
      System.out.println(0);
    } else {
      sum = sum / 3;
      int[] count = new int[arr.length];
      long currSum = 0;
      for (int i = arr.length - 1; i >= 0; i--) {
        currSum += arr[i];
        if (currSum == sum) {
          count[i] = 1;
        }
      }

      for (int i = arr.length - 2; i >= 0; i--) {
        count[i] += count[i + 1];
      }

      long ans = 0;
      currSum = 0;
      for (int i = 0; i + 2 < n; ++i) {
        currSum += arr[i];
        if (currSum == sum)
          ans += count[i + 2];
      }
      System.out.println(ans);
    }

    scn.close();
  }
}
