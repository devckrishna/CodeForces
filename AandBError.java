import java.util.*;

public class AandBError {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;

    for (int i = 0; i < n; i++) {
      int curr = scn.nextInt();
      a = a ^ curr;
    }

    for (int i = 0; i < n - 1; i++) {
      int curr = scn.nextInt();
      b = b ^ curr;
    }

    for (int i = 0; i < n - 2; i++) {
      int curr = scn.nextInt();
      c = c ^ curr;
    }
    System.out.println(a ^ b);
    System.out.println(b ^ c);
    scn.close();
  }
}