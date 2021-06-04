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
    int arr[4];
    for (int i = 0; i < 4; i++) {
      cin >> arr[i];
    }
    int first = max(arr[0], arr[1]);
    int second = max(arr[2], arr[3]);
    sort(arr, arr + 4);
    if ((first == arr[2] && second == arr[3]) ||
        (first == arr[3] && second == arr[2])) {
      cout << "YES" << endl;
    } else {
      cout << "NO" << endl;
    }
  }

  return 0;
}