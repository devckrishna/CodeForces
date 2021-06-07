import java.util.*;

public class FileName {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String str = scn.next();
    int count = 0;
    if (str.length() >= 3) {
      for (int i = 0; i < n - 2; i++) {
        String s = str.substring(i, i + 3);
        if (s.equals("xxx")) {
          count++;
        }
      }
    }
    System.out.println(count);
    scn.close();
  }
}
