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
    ll n;
    cin >> n;
    ll arr[n];
    for (int i = 0; i < n; i++) {
      cin >> arr[i];
    }
    ll temp = n / 2;
    cout << 3 * n << endl;
    for (ll i = 1; i <= n; i += 2) {
      ll x = i;
      ll y = i + 1;
      cout << 1 << " " << x << " " << y << endl;
      cout << 2 << " " << x << " " << y << endl;
      cout << 1 << " " << x << " " << y << endl;
      cout << 1 << " " << x << " " << y << endl;
      cout << 2 << " " << x << " " << y << endl;
      cout << 1 << " " << x << " " << y << endl;
    }
  }

  return 0;
}