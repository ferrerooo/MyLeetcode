public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        
        dfs(results, new ArrayList<Integer>(), candidates, target, 0 , 0);
        return results;
    }
    
    private void dfs(List<List<Integer>> results, List<Integer> list, int[] candidates, int target, int index, int sum) {
        if (target == sum) {
            results.add(new ArrayList<Integer>(list));
            return;
        }
        if (sum > target)
            return;
        
        for (int i=index; i<candidates.length; i++) {
            if (i!=index && candidates[i] == candidates[i-1])
                continue;
            list.add(candidates[i]);
            dfs(results, list, candidates, target, i+1, sum+candidates[i]);
            list.remove(list.size()-1);
        }
    }
}