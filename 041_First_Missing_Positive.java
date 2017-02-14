public class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if (nums == null || nums.length == 0)
            return 1;
        
        for (int i=0;i<nums.length; i++) {
            
            while(nums[i]>0 && nums[i]<nums.length && nums[i] != i && nums[i] != nums[nums[i]]) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        
        for (int i=1;i<nums.length;i++) {
            if (i != nums[i])
                return i;
        }
        if (nums[0]!=nums.length)
            return nums.length;
        else
            return nums.length+1;
    }
}