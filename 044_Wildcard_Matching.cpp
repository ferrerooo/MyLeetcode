class Solution {
public:
    bool isMatch(string s, string p) {
        int p1 = 0;
        int p2 = 0;
        int star = -1;
        int mark = -1;
        
        while (p1 < s.length()) {
            if ( p2<p.length() && ( s[p1] == p[p2] || p[p2] == '?' ) ) {
                p1++;
                p2++;
            } else if (p2<p.length() && p[p2] == '*') {
                star = p2;
                mark = p1;
                p2++;
            } else if (star != -1) {
                p2 = star+1;
                p1 = mark++;
            } else
                return false;
        }
        
        while (p2<p.length() && p[p2] == '*')
            p2++;
        
        return p2 == p.length();
    }
};