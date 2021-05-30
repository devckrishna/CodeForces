#include <bits/stdc++.h>
#define ll long long
const int mod = 1000000007;
using namespace std;
const int N = 3e5;

int main() {
  ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
  srand(chrono::high_resolution_clock::now().time_since_epoch().count());
  ll t;
  cin >> t;
  while (t--) {
    int n;
    cin >> t;
    if (!(n & 1)) {
      int p = sqrt(n);
      if (p * p == n) {
        cout << "YES" << endl;
        continue;
      }
      p = sqrt(n * 2);
      if (p * p == n * 2) {
        cout << "YES" << endl;
        continue;
      }
    }
    cout << "NO" << endl;
    }
}
