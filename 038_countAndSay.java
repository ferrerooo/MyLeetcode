public class Solution {
    public String countAndSay(int n) {
        
        String result = "1";
        
        for (int i=1;i<=n-1;i++) {
            String temp = "";
            int count = 1;
            char c = result.charAt(0);
            for (int j=0;j<result.length();j++) {
                if (j==result.length()-1 || result.charAt(j+1)!=c) {
                    temp += (String.valueOf(count) + String.valueOf(c));
                    if (j == result.length()-1)
                        break;
                    count = 1;
                    c = result.charAt(j+1);
                } else {
                    count++;
                }
            }
            result = temp;
        }
        return result;
    }
}