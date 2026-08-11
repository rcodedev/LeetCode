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
    public int findTilt(TreeNode root) {
        postorder(root);
        return  totalTilt;
    }
    int totalTilt=0;
     public int postorder(TreeNode root){
        if(root==null) return 0;
        int left=postorder(root.left);
        int right=postorder(root.right);
        int tilt=Math.abs(left-right);
        totalTilt+=tilt;
        return root.val+left+right;
    }
}