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
    public ListNode middleNode(ListNode head) {
        ListNode tem=head;
        int count=0;
        while(tem!=null){
            count++;
            tem=tem.next;
        }
        count=count/2+1;
        int i=1;
        while(i<count){
           head=head.next;
            i++;
        }
        return head;

    }
}