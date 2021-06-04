#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef pair<string, string> pss;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<pii> vii;
typedef vector<ll> vl;
typedef vector<vl> vvl;
typedef priority_queue<int, vector<int>, greater<int>> min_heap;
typedef priority_queue<int> max_heap;

bool compHeap(int a, int b);
typedef priority_queue<int, vector<int>, decltype(compHeap)> heap;

double EPS = 1e-9;
int Size = 0;
int INF = 1000000005;
long long INFF = 1000000000000000005ll;
double PI = acos(-1);
int dirx[8] = {-1, 0, 0, 1, -1, -1, 1, 1};
int diry[8] = {0, 1, -1, 0, -1, 1, -1, 1};

#define FOR(a, b, c) for (int(a) = (b); (a) < (c); ++(a))
#define FORD(a, b, c) for (int(a) = (b); (a) >= (c); --(a))
#define FORSQ(a, b, c) for (int(a) = (b); (a) * (a) <= (c); ++(a))
#define FOREACH(a, b) for (auto &(a) : (b))
#define REP(i, n) FOR(i, 0, n)
#define MAX(a, b) a = max(a, b)
#define MIN(a, b) a = min(a, b)
#define SQR(x) ((ll)(x) * (x))
#define RESET(a, val) memset(a, val, sizeof(a))
#define f first
#define s second
#define mp make_pair
#define pb push_back
#define All(v) v.begin(), v.end()
#define AllA(arr, sz) arr, arr + sz
#define SIZE(v) (int)v.size()
#define SORT(v) sort(All(v))
#define RSORT(v) sort(All(v), greater<int>)
bool comp(ll a, ll b);
#define CSORT(v) sort(All(v), comp);
#define REVERSE(v) reverse(All(v))
#define SORTA(arr, sz) sort(AllA(arr, sz))
#define REVERSEA(arr, sz) reverse(AllA(arr, sz))
#define PERMUTE next_permutation

vector<bool> prime(Size, true);

void Sieve() {
  prime[0] = prime[1] = false;
  FORSQ(p, 2, Size) {
    if (prime[p] == true) {
      FOR(i, SQR(p), Size)
      prime[i] = false;
    }
  }
}
bool compHeap(int a, int b) { return a > b; }

bool comp(ll a, ll b) { return a > b; }
int gcd(int a, int b) {
  if (b == 0) return a;
  return gcd(b, a % b);
}
void solve() {
  int n, co = 0, a = -1, res = 0;
  cin >> n;
  vi arr(n, 0);
  FOR(i, 0, n)
  cin >> arr[i];
  FOR(i, 0, n) {
    if (arr[i] & 1) {
      co++;
    } else {
      a++;
      swap(arr[a], arr[i]);
      res += n - a - 1;
    }
  }
  FOR(i, a + 1, n) {
    FOR(j, i + 1, n) {
      if (gcd(arr[i], arr[j]) > 1) {
        res++;
      }
    }
  }
  cout << res << "\n";
}

int main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);

  ll t = 1;
  cin >> t;
  while (t--) {
    solve();
  }

  return 0;
}