# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        if not root:
            return []
        result=[]
        queue=deque()
        queue.append(root)
        while queue:
            size=len(queue)
            currLevel=[]
            for _ in range(size):
                node=queue.popleft()
                currLevel.append(node.val)
            
                if node.left:
                    queue.append(node.left)
                
                if node.right:
                    queue.append(node.right)
            result.append(currLevel)
            
        
        return result
        
        