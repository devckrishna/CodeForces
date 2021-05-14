import java.util.*;

public class Fence {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    long[] arr = new long[n + 100];
    long[] temp = new long[n + 100];
    for (int i = 1; i <= n; i++) {
      arr[i] = scn.nextLong();
      temp[i] = temp[i - 1] + arr[i];
    }
    long min = temp[k];
    long index = 0;
    for (int i = k + 1; i <= n; i++) {
      if (temp[i] - temp[i - k] < min) {
        min = temp[i] - temp[i - k];
        index = i - k;
      }
    }
    System.out.println(index + 1);

    scn.close();
  }
}
