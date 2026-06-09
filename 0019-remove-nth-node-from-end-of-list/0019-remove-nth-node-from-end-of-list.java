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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode tem=head;
        int c=0;
        while(tem!=null){
            c++;
            tem=tem.next;
        }
        if(n==c){
            return head.next;
        }
        ListNode temp=head;
        int cn=1;
        while(temp!=null){
            if(cn+1==c-n+1){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            cn++;
        }
        return head;
    }
}