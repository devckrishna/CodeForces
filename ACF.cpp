
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
    bool flag = true;

    for (int i = 0; i < n; i++) {
      int curr;
      cin >> curr;
      if (curr < 0) flag = false;
    }
    if (!flag) {
      cout << "NO" << endl;
      continue;
    }
    if (flag) cout << "YES" << endl;

    cout << 300 << endl;
    for (int i = 0; i < 300; i++) {
      cout << i << ' ';
    }
    cout << endl;
  }
}
