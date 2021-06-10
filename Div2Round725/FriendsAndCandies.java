import java.util.Scanner;

public class FriendsAndCandies {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int[] arr = new int[n];
      boolean flag = false;
      int sum = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
        sum += arr[i];
        if (i > 0) {
          if (arr[i - 1] != arr[i]) {
            flag = true;
          }
        }
      }
      if (n == 1) {
        System.out.println(0);
        continue;
      } else if (!flag) {
        System.out.println(0);
        continue;
      } else if (sum % n != 0) {
        System.out.println(-1);
        continue;
      } else {
        int count = 0;
        for (int i = 0; i < n; i++) {
          if (arr[i] > (sum / n)) {
            count++;
          }
        }
        System.out.println(count);

      }
    }

    scn.close();
  }
}
