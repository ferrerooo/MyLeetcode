# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        result = []
        stack = []
        p = root
        while p or stack:
            # Save the nodes which have left child
            while p:
                stack.append(p)
                p = p.left
            if stack:
                p = stack.pop()
                # Visit the middle node
                result.append(p.val)
                # Visit the right subtree
                p = p.right
        return result