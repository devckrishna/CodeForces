import java.util.Scanner;

public class BadBoy {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int m = scn.nextInt();
      int x = scn.nextInt();
      int y = scn.nextInt();
      if (x == 0 || y == 0) {

      }

      System.out.println(n + " " + 1 + " " + 1 + " " + m);
    }
    scn.close();
  }
}
