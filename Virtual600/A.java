import java.io.*;
import java.util.*;

public class A {
  static PrintWriter out = new PrintWriter((System.out));
  static Reader sc = new Reader();

  public static void main(String args[]) throws IOException {

    int t = sc.nextInt();
    while (t-- > 0) {
      solve();
    }
    out.close();
  }

  public static void solve() {
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }
    int l = -1;
    int r = -1;
    for (int i = 0; i < n; i++) {
      if (a[i] != b[i]) {
        if (l == -1) {
          l = i;
        } else {
          r = i;
        }
      }
    }
    if (l == -1 && r == -1) {
      out.println("YES");
      return;
    }
    if (r == -1) {
      r = n - 1;
    }
    boolean flag = false;
    int diff = a[l] - b[l];
    if (diff > 0) {
      out.println("NO");
      return;
    }
    for (int i = l + 1; i <= r; i++) {
      int currDiff = a[i] - b[i];
      if (currDiff != diff) {
        flag = true;
        break;
      }
      diff = currDiff;
    }
    if (flag) {
      out.println("NO");
    } else {
      out.println("YES");
    }
  }

  static class Reader {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    public String next() {
      while (!st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public String nextLine() {
      try {
        return br.readLine();
      } catch (Exception e) {
        e.printStackTrace();
      }
      return null;
    }

    public boolean hasNext() {
      String next = null;
      try {
        next = br.readLine();
      } catch (Exception e) {
      }
      if (next == null) {
        return false;
      }
      st = new StringTokenizer(next);
      return true;
    }
  }
}