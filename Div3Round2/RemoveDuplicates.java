import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    Set<Integer> set = new HashSet<>();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    List<Integer> ans = new ArrayList<>();
    for (int i = n - 1; i >= 0; i--) {
      if (!set.contains(arr[i])) {
        set.add(arr[i]);
        ans.add(arr[i]);
      }
    }
    System.out.println(ans.size());
    for (int i = ans.size() - 1; i >= 0; i--) {
      System.out.print(ans.get(i) + " ");
    }
    scn.close();
  }
}