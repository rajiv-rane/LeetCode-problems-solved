/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void postorder(List<Integer>nodes,TreeNode root){
        if(root==null)
            return;
        postorder(nodes,root.left);
        postorder(nodes,root.right);
        nodes.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postorder(list,root);
        return list;
    }
}