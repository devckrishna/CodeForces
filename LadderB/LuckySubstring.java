
import java.io.*;
import java.util.*;

public class LuckySubstring {
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
    String s = sc.next();
    int four = 0;
    int seven = 0;
    for (char ch : s.toCharArray()) {
      if (ch == '4') {
        four++;
      } else if (ch == '7') {
        seven++;
      }
    }
    if (four == 0 && seven == 0) {
      out.println(-1);
    } else if (four >= seven) {
      out.print(4);
    } else {
      out.println(7);
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