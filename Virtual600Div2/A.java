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
    int index = -1;
    boolean flag = false;
    int diff = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      if (a[i] > b[i]) {
        flag = true;
        break;
      }
      int currDiff = a[i] - b[i];
      if (diff == Integer.MAX_VALUE) {
        if (currDiff == 0) {
          continue;
        }
        diff = currDiff;
      } else {
        if (currDiff == 0) {
          index = i;
          break;
        }
        if (currDiff != diff) {
          flag = true;
          break;
        }
      }
    }

    if (index != -1) {
      for (int i = index; i < n; i++) {
        if (a[i] != b[i]) {
          flag = true;
          break;
        }
      }
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