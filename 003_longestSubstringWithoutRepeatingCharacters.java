public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        int longestSubStrLen = 0;
        int p1 = 0;
        int p2 = 0;
        Set<Character> set = new HashSet();
        while (p2 < s.length()) {
            if (!set.contains(s.charAt(p2))) {
                set.add(s.charAt(p2));
            } else {
                longestSubStrLen = Math.max(longestSubStrLen, p2-p1);
                while (s.charAt(p1) != s.charAt(p2)) {
                    set.remove(s.charAt(p1));
                    p1++;
                }
                p1++;
            }
            p2++;
        }
        longestSubStrLen = Math.max(longestSubStrLen, p2-p1);
        return p1==0? s.length():longestSubStrLen;
    }
}