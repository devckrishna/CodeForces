import java.util.Scanner;

public class RedBlueBeans {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    while (n-- > 0) {
      long r = scn.nextLong();
      long b = scn.nextLong();
      long d = scn.nextLong();
      if (Math.abs(r - b) <= d) {
        System.out.println("YES");
        continue;
      }
      if (r > b) {
        long temp = r;
        r = b;
        b = temp;
      }
      if (r * (d + 1) < b) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }

    scn.close();
  }
}
