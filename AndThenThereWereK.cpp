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
    int num = 2;
    while (num <= n) {
      num = num * 2;
    }
    num = num / 2;
    cout << num - 1 << endl;
  }

  return 0;
}