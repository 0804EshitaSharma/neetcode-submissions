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
    public boolean fun(TreeNode root, int max, int min) {
         if(root == null){
            return true;
        }
        if( root.val > min && root.val < max){
             return fun(root.left, root.val, min) &&
              fun(root.right, max, root.val);
        }else{
            return false;
        }
      
      
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return fun(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
}
