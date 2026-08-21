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
    public boolean isValidBST(TreeNode root) {
        
        if(root==null){
            return true;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Long> minq=new LinkedList<>();
        Queue<Long> maxq=new LinkedList<>();
        q.add(root);
        minq.add(Long.MIN_VALUE);
        maxq.add(Long.MAX_VALUE);

        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            long min=minq.poll();
            long max=maxq.poll();
            if(temp.val<=min||temp.val>=max){
                return false;
            }
            if(temp.left!=null){
                q.add(temp.left);
                minq.add(min);
                maxq.add((long)temp.val);
            }
            if(temp.right!=null){
                q.add(temp.right);
                minq.add((long)temp.val);
                maxq.add(max);
            }
        }
        return true;
    }
}