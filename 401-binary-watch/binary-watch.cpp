class Solution {
public:
    vector<string> readBinaryWatch(int turnedOn) {
        vector<string> res;
        for(int h=0; h<12; h++) for(int m=0; m<60; m++){
            int leds_needed = __builtin_popcount(h) + __builtin_popcount(m);
            if(leds_needed == turnedOn) res.push_back(format("{}:{:02d}", h, m));
        }
        return res;
    }
};