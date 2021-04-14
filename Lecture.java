import java.util.HashMap;
import java.util.Scanner;

public class Lecture {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    HashMap<String, String> firstMap = new HashMap<>();
    HashMap<String, String> secondMap = new HashMap<>();

    for (int i = 0; i < m; i++) {
      String first = scn.next();
      String second = scn.next();
      firstMap.put(first, second);
      secondMap.put(second, first);
    }

    String[] text = new String[n];

    for (int i = 0; i < n; i++) {
      text[i] = scn.next();
    }

    for (int i = 0; i < n; i++) {
      String word = text[i];
      if (firstMap.containsKey(word)) {
        if (word.length() <= firstMap.get(word).length()) {
          System.out.print(word + " ");
        } else {
          System.out.print(firstMap.get(word) + " ");
        }
      } else if (secondMap.containsKey(word)) {
        if (word.length() <= secondMap.get(word).length()) {
          System.out.println(word + " ");
        } else {
          System.out.println(secondMap.get(word) + " ");
        }
      }
    }

    scn.close();
  }
}