#include <bits/stdc++.h>
#define ll long long
const int mod = 1000000007;
using namespace std;
const int N = 3e5;

bool isAll(string a, int n) {
  for (int i = 1; i < n - 1; i++) {
    if (a[i] == '0') {
      if (a[i - 1] == '0' && a[i + 1] == '1') {
        return 1;
      }
      if (a[i - 1] == '1' && a[i + 1] == '0') {
        return 1;
      }
    }
  }

  if (a[1] == '1' && a[0] == '0') {
    return 1;
  }
  if (a[n - 1] == '0' && a[n - 2] == '1') {
    return 1;
  }
  return 0;
}

int main() {
  ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
  srand(chrono::high_resolution_clock::now().time_since_epoch().count());
  string s;
  int t;
  cin >> t;
  while (t--) {
    int n;
    int m;
    cin >> n >> m >> s;
    int arr[N];
    for (int i = 0; i < n; i++) {
      arr[i] = s.at(i) - '0';
    }
    bool flag = 0;
    int size = min(m, n);
    while (size--) {
      // if (isAll(s, n) == 0) {
      //   break;
      // }
      if (s[0] == '0' && s[1] == '1') {
        arr[0] = 1;
      }
      for (int i = 1; i < n - 1; i++) {
        if (s[i] == '0' && s[i - 1] == '0' && s[i + 1] == '1') {
          arr[i] = 1;
        } else if (s[i] == '0' && s[i - 1] == '1' && s[i + 1] == '0') {
          arr[i] = 1;
        }
      }
      if (s[n - 1] == '0' && s[n - 2] == '1') {
        arr[n - 1] = 1;
      }
      for (int i = 0; i < n; i++) {
        s[i] = arr[i] == 0 ? '0' : '1';
      }
    }

    for (int i = 0; i < n; i++) {
      cout << arr[i];
    }
    cout << endl;
  }

  return 0;
}