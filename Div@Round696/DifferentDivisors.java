import java.util.Scanner;

public class DifferentDivisors {
  static boolean[] flag = new boolean[1000010];
  static boolean[] p = new boolean[1000010];

  public static void is_prime() {
    for (int i = 2; i < 100000; i++) {
      if (!flag[i]) {
        p[i] = true;
        for (int j = 1; i * j < 100000; j++)
          flag[i * j] = true;
      }
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      is_prime();

      int d = scn.nextInt();
      int fst = d + 1;
      while (!p[fst])
        fst++;
      int snd = fst + d;
      while (!p[snd])
        snd++;
      System.out.println(fst * snd);
    }

    scn.close();
  }
}
