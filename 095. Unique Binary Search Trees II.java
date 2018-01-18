/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<TreeNode>();
        return recur(1, n);
    }
    
    private List<TreeNode> recur(int start, int end) {
        List<TreeNode> list = new ArrayList();
        if (start > end) {
            list.add(null);
            return list;
        }
        if (start == end) {
            TreeNode node = new TreeNode(start);
            list.add(node);
            return list;
        }
        for (int i=start; i<=end; i++) {
            List<TreeNode> left = recur(start, i-1);
            List<TreeNode> right = recur(i+1, end);
            for (TreeNode l:left) {
                for (TreeNode r:right) {
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    list.add(node);
                }
            }
        }
        return list;
    }
}
