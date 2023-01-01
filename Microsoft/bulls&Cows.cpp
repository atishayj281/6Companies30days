#include<bits/stdc++.h>

string getHint(string secret, string guess) {
        int n = secret.length();
        int bulls = 0;
        unordered_map<char, int> mp;
        for(int i = 0; i<n; i++) {
            mp[guess[i]]++;
        }
        int cows = 0;
        for(int i = 0; i<n; i++) {
            if(mp[secret[i]] != 0) {
                cows++;
                mp[secret[i]]--;
            }
            if(secret[i] == guess[i]) {
                bulls++;
                cows--;
            }
        }
        return to_string(bulls)+("A")+(to_string(cows))+("B");
}

int main(int argc, char const *argv[])
{
	cout<<getHint("1897", "7819");
	return 0;
}
