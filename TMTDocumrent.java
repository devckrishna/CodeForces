import java.util.Scanner;

public class TMTDocumrent {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      String str = scn.next();
      double wordT = 0;
      double wordM = 0;
      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == 'T') {
          wordT++;
        } else {
          wordM++;
        }
      }

      if (wordT != 2 * wordM) {
        System.out.println("NO");
      } else {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
          if (str.charAt(i) == 'T') {
            count++;
          } else {
            count--;
          }
          if (count < 0) {
            flag = true;
            break;
          }
        }
        if (flag) {
          System.out.println("NO");
        } else {
          flag = false;
          count = 0;
          StringBuilder sb = new StringBuilder();
          sb.append(str);
          sb.reverse();
          String s = sb.toString();
          for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'T') {
              count++;
            } else {
              count--;
            }
            if (count < 0) {
              flag = true;
              break;
            }
          }
          if (flag) {
            System.out.println("NO");
          } else {
            System.out.println("YES");
          }
        }
      }

    }

    scn.close();
  }
}
