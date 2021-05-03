import java.util.Scanner;

public class YoungPhysicist {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int x = 0;
    int y = 0;
    int z = 0;
    for (int i = 0; i < n; i++) {
      x += scn.nextInt();
      y += scn.nextInt();
      z += scn.nextInt();
    }
    if (x != 0 || y != 0 || z != 0) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }

    scn.close();
  }
}
