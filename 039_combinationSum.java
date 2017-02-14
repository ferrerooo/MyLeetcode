public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        dfs(results, new ArrayList(), candidates, 0, 0, target);
        return results;
    }
    // 这种方法的问题是：必须要先排序，才对。比如 {4,3} 7, 如果不排序，输出就是空，就错了。
    private void dfs(List<List<Integer>> results, List<Integer> list, int[] candidates, int index, int sum, int target) {
        if (index == candidates.length)
            return;
        if (sum + candidates[index] == target) {
            list.add(candidates[index]);
            results.add(new ArrayList<Integer>(list));
            list.remove(list.size()-1);
            return;
        }
        
        if (sum + candidates[index] > target)
            return;
        
        list.add(candidates[index]);
        dfs(results, list, candidates, index, sum+candidates[index], target);
        list.remove(list.size()-1);
        
        dfs(results, list, candidates, index+1, sum, target);
        
        //list.add(candidates[index]);
        //for (int i=index; i<candidates.length; i++)  {
        //    dfs(results, list, candidates, i, sum+candidates[index], target);
        //}
    }
}