class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        
        vector<vector<int>> results;
        vector<int> visited(nums.size(), 0);
        vector<int> res;
        dfs(results, visited, res, nums);
        return results;
    }
    
    void dfs(vector<vector<int>>& results, vector<int>& visited, vector<int>& res, vector<int>& nums) {
        if (res.size() == nums.size()) {
            results.push_back(res);
            return;
        }
        for (int i=0;i<nums.size();i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                res.push_back(nums[i]);
                dfs(results, visited, res, nums);
                visited[i] = 0;
                res.pop_back();
            }
        }
    }
};