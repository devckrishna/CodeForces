import java.util.*;

public class Meximization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; ++i)
                a.add(scn.nextInt());
            Collections.sort(a);
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i == 0 || a.get(i) != a.get(i - 1)) {
                    b.add(a.get(i));
                }
            }
            for (int i = 0; i < n; i++) {
                if (i > 0 && a.get(i) == a.get(i - 1)) {
                    b.add(a.get(i));
                }
            }
            for (Integer x : b) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}