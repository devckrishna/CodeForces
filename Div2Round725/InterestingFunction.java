import java.util.Scanner;

public class InterestingFunction {
  public static long solve(long value) {
    long ans = 0;
    long temp = value;
    while (temp > 0) {
      ans = ans + temp;
      temp /= 10;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      long l = scn.nextLong();
      long r = scn.nextLong();
      long ans = solve(r) - solve(l);
      System.out.println(ans);
    }

    scn.close();
  }
}
