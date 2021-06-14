import java.util.*;

public class VanyaAndLanterns {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int l = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Arrays.sort(arr);
    long max = Math.max(arr[0], l - arr[n - 1]) * 2;
    for (int i = 1; i < n; i++) {
      max = Math.max(max, arr[i] - arr[i - 1]);
    }
    System.out.println(String.format("%.10f", max / 2.0));
    scn.close();
  }
}
