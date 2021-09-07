import java.io.*;
import java.util.*;

public class B {
  static PrintWriter out = new PrintWriter((System.out));
  static Reader sc = new Reader();

  public static void main(String args[]) throws IOException {

    // int t = sc.nextInt();
    // while (t-- > 0) {
    solve();
    // }
    out.close();
  }

  public static void solve() {
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Set<Integer> set = new HashSet<>();
    Set<Integer> seen = new HashSet<>();
    if (arr[0] < 0 || arr[arr.length - 1] > 0) {
      out.println(-1);
      return;
    }
    List<Integer> ans = new ArrayList<>();
    boolean flag = false;
    int index = 0;
    for (int i = 0; i < n; i++) {
      int curr = arr[i];
      if (seen.contains(curr)) {
        flag = true;
        break;
      }
      if (curr > 0) {
        set.add(curr);
        seen.add(curr);
      } else {
        if (!set.contains(-curr)) {
          flag = true;
          break;
        } else {
          set.remove(-curr);
          if (set.size() == 0) {
            ans.add(i - index + 1);
            index = i + 1;
            seen = new HashSet<>();
          }
        }
      }
    }
    if (flag || set.size() > 0) {
      out.println(-1);
    } else {
      out.println(ans.size());
      for (int curr : ans) {
        out.print(curr + " ");
      }
      out.println();
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