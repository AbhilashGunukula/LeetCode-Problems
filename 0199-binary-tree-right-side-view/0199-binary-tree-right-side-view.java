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
      Queue<TreeNode> q = new LinkedList<>();
      //Stack<Integer> s = new LinkedList<>();

        if(root == null ) return res;
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            List<Integer> innerList = new ArrayList<>();
            for(int i =0; i<size; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                innerList.add(node.val);
            }

            res.add(innerList.get(innerList.size()-1));

        }

        return res;

        
        
    }
}