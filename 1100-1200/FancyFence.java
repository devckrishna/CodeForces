import java.util.Scanner;

public class FancyFence {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      if (360 % (180 - n) == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    scn.close();
  }
}
