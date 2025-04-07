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
    public TreeNode insertIntoBST(TreeNode root, int insertNode) {

        
        TreeNode node = new TreeNode(insertNode);
        if(root == null) return node;

        TreeNode dummy = root;

        while(root != null){
            if(root.val > insertNode){
                if(root.left == null){
                    root.left = node;
                    break;
                }else{
                root = root.left;
                }

            }else{
                if(root.right == null){
                    root.right = node; break;
                }
                else{
                root = root.right;
                }
            }
        }


        return dummy;
        
    }
}