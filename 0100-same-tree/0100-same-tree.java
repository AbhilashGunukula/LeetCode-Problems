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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        int result = sameTree(p,q);
        if(result == -1) return false;

        return true;
        
    }

    public int sameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return 0;

        if( p==null || q==null || p.val != q.val ) return -1;

        int lH = sameTree(p.left, q.left);
        if(lH == -1) return -1;
        int rH = sameTree(p.right, q.right);
        if(rH==-1) return -1;

        return 1+Math.max(lH,rH);
    }
}