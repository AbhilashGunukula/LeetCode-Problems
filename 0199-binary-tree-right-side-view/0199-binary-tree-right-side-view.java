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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        traverseForRight(root, 0, res);

        return res;
        
    }

    private void traverseForRight(TreeNode root, int level, List<Integer> res){
        if(root == null) return;

        if(res.size() == level) res.add(root.val);

        traverseForRight(root.right, level+1, res);
        traverseForRight(root.left, level+1, res);
    }
}