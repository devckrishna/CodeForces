import java.util.Scanner;

public class AntonAndTheCurrencyYouKnow {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();

    char[] ans = str.toCharArray();
    int last = -1;
    boolean flag = false;
    for (int i = 0; i < str.length() - 1; i++) {
      if ((ans[i] - '0') % 2 == 0) {
        if ((ans[i] - '0') < (ans[str.length() - 1] - '0')) {
          char ch = ans[i];
          ans[i] = ans[str.length() - 1];
          ans[str.length() - 1] = ch;
          flag = true;
          break;
        } else {
          last = i;
        }
      }
    }

    if (!flag) {
      if (last != -1) {
        char ch = ans[last];
        ans[last] = ans[str.length() - 1];
        ans[str.length() - 1] = ch;
        System.out.println(String.valueOf(ans));
      } else {
        System.out.println(-1);
      }
    } else {
      System.out.println(String.valueOf(ans));
    }

    scn.close();
  }
}
