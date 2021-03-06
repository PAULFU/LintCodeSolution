"""
Definition of TreeNode:
"""


class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None


class Solution:
    """
    @param root: The root of binary tree.
    @return: True if this Binary tree is Balanced, or false.
    """

    def isBalanced(self, root):
        if root is None:
            return True
        balanced, __ = self.validate(root)

    def validate(self, root):
        if root is None:
            return True, 0
        balanced, leftheight = self.validate(root.left)
        if not balanced:
            return False, 0
        balanced, rightheight = self.validate(root.right)
        if not balanced:
            return False, 0

        return abs(leftheight - rightheight) <= 1, max(leftheight, rightheight) + 1
