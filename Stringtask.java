import java.util.*;
import java.util.Scanner;

public class Stringtask {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    String ans = "";
    Set<Character> set = new HashSet<>();
    set.add('A');
    set.add('a');
    set.add('O');
    set.add('o');
    set.add('Y');
    set.add('y');
    set.add('E');
    set.add('e');
    set.add('U');
    set.add('u');
    set.add('I');
    set.add('i');

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (!set.contains(ch)) {
        ans += '.';
        if (ch < 97) {
          ans += (char) (ch + 32);
        } else {
          ans += ch;
        }
      }
    }

    System.out.println(ans);

    scn.close();
  }
}
