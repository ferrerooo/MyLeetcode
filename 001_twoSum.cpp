class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
		// use default initializer
        vector<int> result;
        // use default initializer
		unordered_map<int, int> dict;
        for (int i = 0;i<nums.size(); i++) {
            if (dict.find(target-nums[i]) != dict.end()) {
                result.push_back(dict[target - nums[i]]);
                result.push_back(i);
                break;
            }
            dict[nums[i]] = i;
        }
        return result;
    }
};