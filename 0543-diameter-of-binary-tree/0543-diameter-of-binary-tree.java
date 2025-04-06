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
    public int diameterOfBinaryTree(TreeNode root) {

        int [] dia = new int [1];
        dOfBT(root, dia);
        return dia[0];
        
    }

    public int dOfBT(TreeNode root, int[] dia){
        if(root == null) return 0;

        int lH = dOfBT(root.left, dia);
        int rH = dOfBT(root.right, dia);

        dia[0] = Math.max(dia[0], lH+rH);


        return 1+Math.max(lH, rH);
    }
}