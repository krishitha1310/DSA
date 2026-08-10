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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size(),x=0;
            int[] arr=new int[size*2];

            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }

                if(temp.left==null){
                    arr[x++]=-101;
                }else{
                    arr[x++]=temp.left.val;
                }
                if(temp.right==null){
                    arr[x++]=-101;
                }else{
                    arr[x++]=temp.right.val;
                }
            }

            int j=0,k=arr.length-1;
            while(j<k){
                if(arr[j]!=arr[k]){
                    return false;
                }
                j++;k--;
            }
        }
        return true;
    }
}