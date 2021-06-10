import java.util.*;

public class NumberOfPairs {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long t = scn.nextLong();

    while (t-- > 0) {
      int n = scn.nextInt();
      long l = scn.nextLong();
      long r = scn.nextLong();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scn.nextLong();
      }
      Arrays.sort(arr);
      long ans = 0;
      int temp = 0;
      int start = n - 1;
      int end = n - 1;
      while (temp < end) {
        start = Math.max(temp, start);
        while (start > temp && arr[temp] + arr[start] >= l) {
          start--;
        }
        while (end > start && arr[temp] + arr[end] > r) {
          end--;
        }
        ans += (end - start);
        ++temp;
      }
      System.out.println(ans);
    }

    scn.close();
  }
}
