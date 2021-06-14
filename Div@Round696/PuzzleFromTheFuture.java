import java.util.Scanner;

public class PuzzleFromTheFuture {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int[] arr = new int[n];
      int[] ans = new int[n];
      String s = scn.next();
      for (int i = 0; i < n; i++) {
        arr[i] = s.charAt(i) - '0';
      }
      ans[0] = 1;
      for (int i = 1; i < n; i++) {
        int first = arr[i - 1];
        int second = ans[i - 1];
        int third = arr[i];
        if (first == 1 && second == 1 && third == 1) {
          ans[i] = 0;
        } else if (first == 1 && second == 1 && third == 0) {
          ans[i] = 1;
        } else if (first == 0 && second == 0) {
          ans[i] = 1;
        } else if ((first == 0 || second == 0) && third == 1) {
          ans[i] = 1;
        } else if ((first == 0 || second == 0) && third == 0) {
          ans[i] = 0;
        }
      }
      for (int i = 0; i < n; i++) {
        System.out.print(ans[i]);
      }
      System.out.println();
    }

    scn.close();
  }
}