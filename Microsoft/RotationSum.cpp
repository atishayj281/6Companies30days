#include<bits/stdc++.h>

int maxRotateFunction(vector<int>& nums) {
        int sum = 0;
        int n = nums.size();
        for(int i = 0; i<n; i++) sum += nums[i];
        int curr_val = 0;
        for(int i=0; i<n; i++) curr_val = curr_val + (nums[i]*(i));
        int res = curr_val;
        for(int i = 1; i<n; i++) {
            int next_val = curr_val - (sum - nums[i-1]) + (nums[i-1]*(n-1));
            curr_val = next_val;
            res = max(res, next_val);
        }

        return res;
}

int main() {
	int n;cin>>n;
	vector<int> arr(n);
	for(int i = 0; i<n; i++) cin>>arr[i];
	cout<<"Result is: "<<maxRotateFunction(nums);
}