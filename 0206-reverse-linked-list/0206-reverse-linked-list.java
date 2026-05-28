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
    public ListNode reverseList(ListNode head) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        ListNode tem=new ListNode(-1);
        ListNode tail=tem;
        for(int i=arr.size()-1;i>=0;i--){
            tail.next=new ListNode(arr.get(i));
            tail=tail.next;
        }
        return tem.next;
    }
}