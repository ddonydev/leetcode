/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode[] newTree = new TreeNode[1];
        clone(newTree,cloned,target);
        return newTree[0];
    }
    public void clone(TreeNode newTree[],TreeNode clonded, TreeNode target){
        if(clonded == null){
            return;
        }
        if(clonded.val == target.val){
            newTree[0]=clonded;
            return;
        }
        clone(newTree, clonded.left, target);
        clone(newTree, clonded.right,target);
    }
}