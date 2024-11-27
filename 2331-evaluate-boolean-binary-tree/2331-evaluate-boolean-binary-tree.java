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
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null) {
            return root.val != 0;
        }

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        boolean answer;
        if(root.val == 2) {
            answer = left | right;
        }
        else {
            answer = left & right;
        }

        return answer;
    }
}