#define ll long long
class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        ll ans = 0;
        ll min_e = INT_MAX;
        ll count_negatives = 0;
        for(auto &i:matrix){
            for(int &j:i){
                if(j < 0) count_negatives++;
                ans += abs(j);
                j = abs(j);
                min_e = min(min_e,j*1LL);
            }
        }
        if(count_negatives%2 != 0){
            ans -= min_e*2;
        }
        return ans;
    }
};