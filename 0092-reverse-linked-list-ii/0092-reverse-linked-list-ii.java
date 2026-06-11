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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode curr=head;
        int c=1,start=1;
        ListNode bef=null;
        ListNode tem=null;
        if(head.next==null){
            return head;
        }
        while(curr!=null){
            if(c+1==left){
                bef=curr;
            }
            if(c==left){
                start=c;
                ListNode prev=null;
                ListNode cur=curr;
                ListNode next=null;
                while(c<=right&&cur!=null){
                    next=cur.next;
                    if(c==left){
                         tem=curr;
                    }
                    cur.next=prev;
                    prev=cur;
                    cur=next;
                    c++;
                }
                
                ListNode nextt=cur;
                if(start==1){
                    tem.next=cur;
                    head=prev;
                }
                else{
                bef.next=prev; 
                tem.next=cur;
                }
                break;
            }
            curr=curr.next;
            c++;
        }
        return head;
    }
}