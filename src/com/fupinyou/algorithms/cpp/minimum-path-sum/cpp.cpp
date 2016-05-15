// minimum-path-sum.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "MinimumPathSum.h"
#include <vector>
#include <iostream>

using namespace std;
int main()
{
	vector<vector<int> > v(3,vector<int>(3));
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3;j++)
		{
			v[i][j] = i*j;
		}
	}
	MinimumPathSum mps;
	int result=mps.minPathSum(v);
	cout << result << endl;
	return 0;
}

