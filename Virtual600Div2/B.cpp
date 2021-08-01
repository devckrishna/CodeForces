#include <bits/stdc++.h>
using namespace std;

#define ll long long int
#define yes_or_no(boolean) \
  if (boolean)             \
    cout << "Yes";         \
  else                     \
    cout << "No";

// vector<int> a;

void solution(vector<int> a)
{
  vector<int> res;
  int current = 0;
  set<int> s, visited;
  for (int i = 0; i < a.size(); i++)
  {
    if (a[i] < 0)
    {
      if (s.count(abs(a[i])))
      {
        s.erase(abs(a[i]));
        current += 2;
        if (s.size() == 0)
        {
          res.push_back(current);
          current = 0;
          visited.clear();
        }
        else
        {
          visited.insert(abs(a[i]));
        }
      }
      else
      {
        cout << -1;
        return;
      }
    }
    else
    {
      if (s.count(a[i]) || visited.count(a[i]))
      {
        cout << -1;
        return;
      }
      else
      {
        s.insert(a[i]);
      }
    }
  }
  if (s.size())
  {
    cout << -1;
  }
  else
  {
    cout << res.size() << endl;
    for (auto i : res)
    {
      cout << i << " ";
    }
  }
}

int main()
{
  int n;
  cin >> n;
  vector<int> a;
  for (int i = 0, j; i < n; i++)
  {
    cin >> j;
    a.push_back(j);
  }
  solution(a);
}