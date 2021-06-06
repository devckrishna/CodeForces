import java.util.Scanner;

public class OmA {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      boolean flag = false;
      while (n-- > 0) {
        int curr = scn.nextInt();
        System.out.print(curr + " ");
        if (curr < 0) {
          flag = true;
          System.out.println("No");
        }
      }
      if (flag == false) {
        System.out.println("YES");
        System.out.println(300);
        for (int i = 0; i < 300; i++) {
          System.out.print(i + " ");
        }
        System.out.println();
      }
    }
    scn.close();
  }
}
