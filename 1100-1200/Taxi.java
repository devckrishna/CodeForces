import java.util.*;
import java.util.Scanner;

public class Taxi {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    Integer[] arr = new Integer[100002];
    Arrays.fill(arr, 1);
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Arrays.sort(arr, Collections.reverseOrder());
    int i = 0;
    int j = n - 1;
    int ans = 0;
    while (arr[i] == 4) {
      i++;
      ans++;
    }
    while (arr[i] == 3 && arr[j] == 1) {
      i++;
      j--;
      ans++;
    }
    while (i <= j && arr[i] == 3) {
      i++;
      ans++;
    }
    while (i <= j && arr[i] == 2 && arr[i + 1] == 2) {
      i += 2;
      ans++;
    }
    while (i <= j && arr[i] == 2) {
      i += 3;
      ans++;
    }
    while (i <= j) {
      i += 4;
      ans++;
    }

    System.out.println(ans);
    scn.close();
  }

}
