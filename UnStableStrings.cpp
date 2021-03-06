#include <bits/stdc++.h>
#define ll long long
const int mod = 1000000007;
using namespace std;
const int N = 3e5;
int main() {
  ll t;
  cin >> t;
  while (t--) {
    string st;
    cin >> st;
    ll n = st.size();
    vector<ll> dp(n);
    vector<ll> last0(n, -1);
    vector<ll> last1(n, -1);
    for (ll i = 0; i < n; i++) {
      if (st[i] == '0') {
        last0[i] = i;
      } else {
        if (i) {
          last0[i] = last0[i - 1];
        }
      }
    }
    for (ll i = 0; i < n; i++) {
      if (st[i] == '1') {
        last1[i] = i;
      } else {
        if (i) {
          last1[i] = last1[i - 1];
        }
      }
    }
    dp[0] = 0;
    ll ans = 1;
    for (ll i = 1; i < n; i++) {
      if (st[i] == '?') {
        dp[i] = dp[i - 1];
      } else if (st[i] == '1') {
        if (last0[i - 1] == last1[i - 1]) {
          dp[i] = 0;
        } else if (last0[i - 1] > last1[i - 1]) {
          ll idx = last0[i - 1];
          if ((idx & 1) != (i & 1)) {
            dp[i] = dp[idx];
          } else {
            dp[i] = idx + 1;
          }
        } else {
          ll idx = last1[i - 1];
          if ((idx & 1) == (i & 1)) {
            dp[i] = dp[idx];
          } else {
            dp[i] = idx + 1;
          }
        }
      } else {
        if (last0[i - 1] == last1[i - 1]) {
          dp[i] = 0;
        } else if (last0[i - 1] > last1[i - 1]) {
          ll idx = last0[i - 1];
          if ((idx & 1) == (i & 1)) {
            dp[i] = dp[idx];
          } else {
            dp[i] = idx + 1;
          }
        } else {
          ll idx = last1[i - 1];
          if ((idx & 1) != (i & 1)) {
            dp[i] = dp[idx];
          } else {
            dp[i] = idx + 1;
          }
        }
      }
      ans += (i - dp[i] + 1);
    }
    cout << ans << endl;
  }
}