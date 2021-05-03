#include <iostream>
#include <string>
 
using namespace std;
 
bool check(string a)
{
	if(a[0] <= 'Z' && a[0] >= 'A')
	{
		for(int i = 1; i < a.length(); i ++)
		{
			if(a[i] >= 'a' && a[i] <= 'z')
				return false;
		}
		return true;
	}
	else
	{
		for(int i = 1; i < a.length(); i ++)
		{
			if(a[i] >= 'a' && a[i] <= 'z')
				return false;
		}
		return true;
	}
}
 
int main()
{
	string a;
	cin >> a;
	if(check(a))
	{
		for(int i = 0; i < a.length(); i ++)
		{
			if(a[i] <= 'Z' && a[i] >= 'A')
				a[i] = a[i] - 'A' + 'a';
			else
				a[i] = a[i] - 'a' + 'A';
		}
	}
	cout << a;
	return 0;
}