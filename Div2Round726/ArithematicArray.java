import java.util.Scanner;

public class ArithematicArray {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int sum = 0;
      int count = 0;
      for (int i = 0; i < n; i++) {
        sum += scn.nextInt();
        count++;
      }

      if (sum < count) {
        System.out.println(1);
      } else {
        System.out.println(sum - count);
      }
    }

    scn.close();
  }
}