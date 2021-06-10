import java.util.*;

public class Marrays {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      int m = scn.nextInt();
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        int curr = scn.nextInt();
        map.put(curr % m, map.getOrDefault(curr % m, 0) + 1);
      }
      int count = 0;
      for (Integer temp : map.keySet()) {
        if (temp == 0) {
          count++;
        } else if (2 * temp == m) {
          count++;
        } else if (2 * temp < m || !map.containsKey(m - temp)) {
          int first = map.get(temp);
          int second = map.getOrDefault(m - temp, 0);
          count += 1 + Math.max(0, Math.abs(first - second) - 1);
        }
      }
      System.out.println(count);
    }

    scn.close();
  }
}
