import java.util.*;

public class AverageHeight {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while (t-- > 0) {
      int n = scn.nextInt();
      ArrayList<Integer> odd = new ArrayList<>();
      ArrayList<Integer> even = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int item = scn.nextInt();
        if (item % 2 == 0) {
          even.add(item);
        } else {
          odd.add(item);
        }
      }

      for (int i = 0; i < odd.size(); i++) {
        System.out.print(odd.get(i) + " ");
      }
      for (int i = 0; i < even.size(); i++) {
        System.out.print(even.get(i) + " ");
      }
      System.out.println();
    }

    scn.close();
  }
}
