import java.io.*;
import java.util.*;

public class B {
  static PrintWriter out = new PrintWriter((System.out));
  static Reader sc = new Reader();

  public static void main(String args[]) throws IOException {

    // int t = sc.nextInt();
    // while (t-- > 0) {
    // solve();
    // }
    solve();
    out.close();
  }

  public static void solve() {
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];
    }
    List<Integer> ans = new ArrayList<>();
    if (sum != 0) {
      out.println(-1);
    } else {
      boolean flag = false;
      int count = 0;
      Set<Integer> seen = new HashSet<>();
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
        int person = arr[i];
        if (person > 0 && seen.contains(person)) {
          // out.println("reached" + person);
          if (set.size() == 0) {
            ans.add(count);
            count = 0;
          } else {
            flag = true;
            break;
          }
        }

        if (person > 0) {
          if (set.contains(person)) {
            flag = true;
            break;
          }
          seen.add(person);
          set.add(person);
          count++;
        } else {

          // if (!set.contains(Math.abs(person))) {
          // flag = true;
          // break;
          // }
          set.remove(Math.abs(person));
          count++;
        }

      }
      if (count > 0 && set.size() == 0)
        ans.add(count);

      if (flag) {
        out.println(-1);
      } else {
        out.println(ans.size());
        for (int curr : ans) {
          out.print(curr + " ");
        }
      }
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