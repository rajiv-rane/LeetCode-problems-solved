class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root: #Base Case
            return root
        
        #left substree
        self.invertTree(root.left) 
        self.invertTree(root.right)  # right substree
        # Swap the nodes
        root.left, root.right = root.right, root.left
        
        return root
