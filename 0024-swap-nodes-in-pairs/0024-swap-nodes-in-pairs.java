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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        int c=1;
        ListNode prevPair=null;
        
        while(curr!=null&&prev!=null){
            
            ListNode next=curr.next;
            if(c==1){
                head=curr;
            }
            c++;
            curr.next=prev;
            prev.next=next;

            ListNode tem=prev;

           
            if(prevPair!=null){
                prevPair.next=curr;
            }
            prevPair=prev;
            prev=next;
            if(prev!=null)
            curr=prev.next;
           
        }
        return head;
    }
}