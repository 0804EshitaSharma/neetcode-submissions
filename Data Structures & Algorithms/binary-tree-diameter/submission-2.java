class Solution {
    int res = 0;

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        // Diameter passing through this node
        res = Math.max(res, lh + rh);

        // Return height to parent
        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
    }
}