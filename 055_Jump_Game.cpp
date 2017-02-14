class Solution {
public:
    bool canJump(vector<int>& nums) {
        
        int p = 0;
        int end = nums[p];
        
        while (p <= end) {
            int curMax = p + nums[p];
            end = max(end, curMax);
            if (end >= nums.size()-1)
                return true;
            p++;
        }
        return false;
    }
};