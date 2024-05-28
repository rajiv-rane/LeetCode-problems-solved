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
    List<Integer>list=new ArrayList<>();
    // 2 pointer
    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int s=0;int e=list.size()-1;
        while(s<e){
            if(list.get(s)+list.get(e)==k)
                return true;
            else if(list.get(s)+list.get(e)<k)
                s++;
            else
                e--;
        }
        return false;
    }
}