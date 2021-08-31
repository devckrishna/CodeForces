import java.io.*;
import java.util.*;

public class MochaAndHiking {
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
    int[] arr = new int[n + 2];
    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    if (arr[1] == 1) {
      out.print(n + 1 + " ");
      for (int i = 1; i <= n; i++) {
        out.print(i + " ");
      }
      out.println();
      return;
    }

    for (int i = 1; i <= n; i++) {
      if (arr[i] == 0 && arr[i + 1] == 1) {
        for (int j = 1; j <= i; j++) {
          out.print(j + " ");
        }
        out.print(n + 1 + " ");
        for (int j = i + 1; j <= n; j++) {
          out.print(j + " ");
        }
        out.println();
        return;
      }
    }

    for (int i = 1; i <= n; i++) {
      out.print(i + " ");
    }
    out.print(n + 1 + " ");
    out.println();

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