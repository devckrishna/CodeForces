import java.util.*;

public class ChallengingCliffs {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scn.nextLong();
      }
      Arrays.sort(arr);
      long startDiff = arr[1] - arr[0];
      long endDiff = arr[arr.length - 1] - arr[arr.length - 2];
      long diff = Math.min(startDiff, endDiff);
      int idx = -1;
      for (int i = 1; i < arr.length - 1; i++) {
        if (arr[i + 1] - arr[i] < diff) {
          diff = arr[i + 1] - arr[i];
          idx = i;
        }
      }
      List<Long> res = new ArrayList<>();
      if (idx == -1) {
        if (startDiff < endDiff) {
          res.add(arr[0]);
          for (int i = 2; i < arr.length; i++) {
            res.add(arr[i]);
          }
          res.add(arr[1]);
        } else {
          res.add(arr[arr.length - 2]);
          for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 2) {
              res.add(arr[i]);
            }
          }
        }
      } else {
        res.add(arr[idx]);
        for (int i = idx + 2; i < arr.length; i++) {
          res.add(arr[i]);
        }
        for (int i = 0; i < idx; i++) {
          res.add(arr[i]);
        }
        res.add(arr[idx + 1]);
      }
      for (int i = 0; i < arr.length; i++) {
        System.out.print(res.get(i) + " ");
      }
      System.out.println();
    }
    scn.close();
  }
}
