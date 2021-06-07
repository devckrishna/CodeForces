#include <bits/stdc++.h>
using namespace std;

int m, s;

string solve() {
  if (m * 9 < s) return "-1 -1";
  if (m != 1 && s == 0) return "-1 -1";
  if (m == 1 && s == 0) return "0 0";
  string sm = "", t = "";
  int s1 = s, s2 = s;
  for (int i = 0; i < m; i++) {
    int go = max(s1 - 9 * (m - i - 1), (i == 0) ? 1 : 0);
    sm += go + '0';
    s1 -= go;
    int g = min(s2, 9);
    t += g + '0';
    s2 -= g;
  }
  return sm + " " + t;
}

int main() {
  cin >> m >> s;
  cout << solve() << "\n";
}