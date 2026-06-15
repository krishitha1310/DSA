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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode res=new ListNode(0);
        ListNode dum=res;
        int car=0;
        while(p1!=null||p2!=null){
            int a=0,b=0;
                if(p1!=null) {
                    a=p1.val;
                    p1=p1.next;}

                if(p2!=null) {
                    b=p2.val;
                    p2=p2.next;
                }
            int sum=a+b+car;
            if(sum>9){
                res.next=new ListNode(sum%10);
                car=sum/10;
                
            }   else{
                res.next=new ListNode(sum);
                car=0;
            } 
            
            res=res.next;
        }
        if(car!=0){
            res.next=new ListNode(car);
        }
        return dum.next;
    }
}