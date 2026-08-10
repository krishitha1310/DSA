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
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.offer(p);
        q2.offer(q);
        while(!q1.isEmpty()&&!q2.isEmpty()){
            int size1=q1.size();
            int size2=q2.size();
            if(size1!=size2){
                return false;
            }
            for(int i=0;i<size1;i++){
                TreeNode temp1=q1.poll();
                TreeNode temp2=q2.poll();
                if(temp1==null&&temp2==null){
                    continue;
                }
                if(temp1==null||temp2==null){
                    return false;
                }
                if(temp1.val!=temp2.val){
                    return false;
                }
                
                    q1.offer(temp1.left);
                
                
                q1.offer(temp1.right);
                
                
                    q2.offer(temp2.left);
                
              
                q2.offer(temp2.right);
                
            }
        }
        return q1.isEmpty()&&q2.isEmpty();
    }
}