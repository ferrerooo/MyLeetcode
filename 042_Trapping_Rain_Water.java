public class Solution {
    public int trap(int[] height) {
        
        int max = 0;
        
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        
        for (int i=0;i<left.length; i++) {
            left[i] = max;
            max = Math.max(max, height[i]);
        }
        
        max = 0;
        for (int i=height.length-1; i>=0; i--) {
            right[i] = max;
            max = Math.max(max, height[i]);
        }
        
        int result = 0;
        
        for (int i=0;i<height.length;i++) {
            int delta = Math.min(left[i], right[i]) - height[i] ;
            result += delta >0? delta : 0;
        }
        return result;
    }
    
}