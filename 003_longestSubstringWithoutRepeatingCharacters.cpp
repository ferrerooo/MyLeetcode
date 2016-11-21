#include <string>

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if (s.empty())
            return 0;
        
        int table[256] = {};
        for (int i=0;i<256;i++) table[i] = -1;
        int p1=0;
        int p2=0;
        int maxLen = 0;
        while (p2 < s.size()) {
            if (table[s[p2]] != -1) {
                maxLen = std::max(maxLen, p2-p1);
                while (p1 < table[s[p2]]) {
                    table[s[p1]] = -1;
                    p1++;
                }
                p1++;
            }
            table[s[p2]] = p2;
            p2++;
        }
        maxLen = std::max(maxLen, p2-p1);
        return maxLen;
    }
};