/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int c=0;
        Boolean p=true;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
       int  i=1;
        ListNode tem=head;
        while(i<=c/2){
            tem=tem.next;
            i++;
        }
        if(c%2!=0){
            tem=tem.next;
        }
        i=0;
        while(i<c/2){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        
        while(tem!=null){
            if(prev.val!=tem.val){
                p=false;
                return false;
            }
            prev=prev.next;
            tem=tem.next;
        }
        return true;

    }
}