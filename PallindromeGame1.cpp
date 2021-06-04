#include <bits/stdc++.h>
#define ll long long
const int mod = 1000000007;
using namespace std;
const int N = 3e5;

int main() {
  ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
  srand(chrono::high_resolution_clock::now().time_since_epoch().count());

  int t;
  cin >> t;
  while (t--) {
    int n;
    cin >> n;
    string s;
    cin >> s;
    bool flag = true;
    for (int i = 0; i < n; i++) {
      if (s.at(i) != '1') {
        flag = false;
      }
    }
    if (flag) {
      cout << "DRAW" << endl;
    } else {
      cout << "BOB" << endl;
    }
  }

  return 0;
}