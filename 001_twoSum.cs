public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        
        var dict = new Dictionary<int, int>();
        for (int i=0; i<nums.Length; i++) {
            if (dict.ContainsKey(target-nums[i]))
				// return {dict[target-nums[i]], i} directly causes syntax error
                return new int[]{dict[target-nums[i]], i};
            dict[nums[i]] = i;
        }
        return new int[2];
    }
}