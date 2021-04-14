import java.util.*;

public class AmarAndPins {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt();
    int x1 = scn.nextInt();
    int y1 = scn.nextInt();
    int x2 = scn.nextInt();
    int y2 = scn.nextInt();

    if (x1 == x2 && y1 == y2) {
      System.out.println(0);
    } else {
      double ans = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

      int res = (int) Math.ceil(ans / (2 * r));

      System.out.println(res);

      scn.close();
    }

  }
}
