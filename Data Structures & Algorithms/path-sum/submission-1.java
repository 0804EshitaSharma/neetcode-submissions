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
     boolean ans = false;
public void func(TreeNode root,int currentSum, int targetSum) {
       if(root == null){
             return;
        }
       currentSum += root.val;     
       if(root.left == null && root.right == null){
        if (currentSum ==  targetSum){
            ans = true;
            return;
        }
       }   
       func(root.left, currentSum, targetSum);
       func(root.right, currentSum, targetSum);
      
      return ;
    }


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
             return false;
        }
        int currentSum = 0;
        func(root, currentSum, targetSum );
        return ans;
       

    }
}