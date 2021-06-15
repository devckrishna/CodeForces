import java.util.Scanner;

public class LittlePigsAndWolves {
  static char[][] grid;

  public static boolean check(int i, int j) {
    if (i > 0 && grid[i - 1][j] == 'P')
      return true;
    if (i < grid.length - 1 && grid[i + 1][j] == 'P')
      return true;
    if (j > 0 && grid[i][j - 1] == 'P')
      return true;
    if (j < grid[0].length - 1 && grid[i][j + 1] == 'P')
      return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int count = 0;
    int n = scn.nextInt();
    int m = scn.nextInt();
    grid = new char[n][m];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      for (int j = 0; j < m; j++) {
        grid[i][j] = str.charAt(j);
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == 'W' && check(i, j)) {
          count++;
        }
        ;
      }
    }
    System.out.println(count);

    scn.close();
  }
}
