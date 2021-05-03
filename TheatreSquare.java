import java.util.Scanner;

public class TheatreSquare {
  static int mod = 1000000007;

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long ans = 0;
    long n = scn.nextLong();
    long m = scn.nextLong();
    long a = scn.nextLong();

    ans = n % a == 0 ? n / a : n / a + 1;
    ans = ans * (m % a == 0 ? m / a : m / a + 1);

    System.out.println(ans);

    scn.close();
  }
}