import java.util.Scanner;

public class ChatRoom {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    String curr = "hello";
    int j = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == curr.charAt(j)) {
        j++;
        if (j >= curr.length()) {
          break;
        }
      }
    }

    if (j >= curr.length()) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    scn.close();
  }
}
