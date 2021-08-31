import java.io.*;
import java.util.*;

public class MoamenAndKSubArrays {
  public static class Pair {
    int val;
    int index;

    public Pair(int val, int index) {
      this.val = val;
      this.index = index;
    }

  }

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
    int k = sc.nextInt();
    Pair[] arr = new Pair[n];
    for (int i = 0; i < n; i++) {
      int val = sc.nextInt();
      arr[i] = new Pair(val, i);
    }
    Arrays.sort(arr, (a, b) -> a.val - b.val);
    int ans = 1;
    for (int i = 1; i < n; i++) {
      if (arr[i - 1].index + 1 != arr[i].index) {
        ans++;
      }
    }
    if (ans <= k) {
      out.println("YES");
    } else {
      out.println("NO");
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