import java.util.*;

public class InterestingDrink {
  static int UpperBound(int a[], int x) {
    int l = -1, r = a.length;
    while (l + 1 < r) {
      int m = (l + r) >>> 1;
      if (a[m] <= x)
        l = m;
      else
        r = m;
    }
    return l + 1;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Arrays.sort(arr);
    int q = scn.nextInt();
    while (q-- > 0) {
      int m = scn.nextInt();
      int index = UpperBound(arr, m);
      System.out.println(index);
    }

    scn.close();
  }
}
