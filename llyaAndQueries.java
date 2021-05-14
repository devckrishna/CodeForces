import java.util.Scanner;

public class llyaAndQueries {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    int[] arr = new int[str.length() + 1];
    for (int i = 1; i < str.length(); i++) {
      arr[i] = arr[i - 1];
      if (str.charAt(i - 1) == str.charAt(i)) {
        arr[i] = arr[i] + 1;
      }
    }

    int m = scn.nextInt();
    while (m-- > 0) {
      int l = scn.nextInt();
      int r = scn.nextInt();
      System.out.println(arr[r - 1] - arr[l - 1]);
    }

    scn.close();
  }
}