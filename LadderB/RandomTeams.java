import java.util.Scanner;

public class RandomTeams {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long n = scn.nextLong();
    long m = scn.nextLong();
    long X = n % m;
    long Y = n / m;
    long ans1 = Y * (Y - 1) / 2 * (m - X) + Y * (Y + 1) / 2 * X;
    long ans2 = (n - m) * (n - m + 1) / 2;
    System.out.println(ans1 + " " + ans2);

    scn.close();
  }
}
