#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n;
  cin >> n;

  int *arr = new int[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }

  bool flag = true;
  int start = -1;
  int end = n;
  for (int i = 1; i < n; i++)
  {
    if (flag)
    {
      if (arr[i] < arr[i - 1])
      {
        flag = false;
        start = i - 1;
      }
    }
    else
    {
      if (arr[i] > arr[i - 1])
      {
        end = i;
        break;
      }
    }
  }

  if (start != -1)
  {
    reverse(arr + start, arr + end);
    for (int i = 1; i < n; i++)
    {
      if (arr[i] < arr[i - 1])
      {
        flag = false;
        break;
      }
      else
      {
        flag = true;
      }
    }
  }

  if (flag)
  {
    cout << "yes" << endl;
    if (start == -1)
    {
      cout << "1 1" << endl;
    }
    else
    {
      cout << start + 1 << " " << end << endl;
    }
  }
  else
  {
    cout << "no" << endl;
  }

  return 0;
}