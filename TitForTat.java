import java.util.Scanner;

public class TitForTat {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int k = scn.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
      }

      for (int i = 0; i < arr.length - 1 && k >= 0; i++) {
        for (int j = arr.length - 1; j >= i - 1 && k >= 0; j--) {
          if (arr[i] < arr[j]) {
            if (arr[i] - 1 >= 0) {
              arr[i] = arr[i] - 1;
              arr[j] = arr[j] + 1;
              k--;
            }
          }
        }
      }

      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    scn.close();
  }
}
