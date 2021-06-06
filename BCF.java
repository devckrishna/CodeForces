import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BCF {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      Set<String> set = new HashSet<>();
      int n = scn.nextInt();
      String str = scn.next();
      boolean flag = false;

      for (int i = 0; i < n; i++) {
        String st = "";
        st += str.charAt(i);
        set.add(st);
      }

      for (int i = 0; i < n - 1; i++) {
        String st = "";
        st += str.charAt(i);
        st += str.charAt(i + 1);
        set.add(st);
      }

      for (int i = 0; i < n - 2; i++) {
        String st = "";
        st += str.charAt(i);
        st += str.charAt(i + 1);
        st += str.charAt(i + 2);
        set.add(st);
      }

      for (char i = 'a'; i <= 'z'; i++) {
        String st = "";
        st += i;
        if (!set.contains(st)) {
          System.out.println(st);
          flag = true;
          break;
        }
      }

      if (flag == true)
        continue;

      for (char i = 'a'; i <= 'z'; i++) {
        String st = "";
        st += i;
        for (char j = 'a'; j <= 'z'; j++) {
          String st1 = st;
          st1 += j;
          if (!set.contains(st1)) {
            System.out.println(st1);
            flag = true;
            break;
          }
        }

        if (flag)
          break;
      }

      if (flag)
        continue;
      for (char i = 'a'; i <= 'z'; i++) {
        String st = "";
        st += i;
        for (char j = 'a'; j <= 'z'; j++) {
          String st1 = st;
          st1 += j;
          for (char k = 'a'; k <= 'z'; k++) {
            String st2 = st1;
            st2 += k;
            if (!set.contains(st2)) {
              System.out.println(st2);
              flag = true;
              break;
            }
          }
          if (flag)
            break;
        }
        if (flag)
          break;
      }
    }

    scn.close();
  }
}
