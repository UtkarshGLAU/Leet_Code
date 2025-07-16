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
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        n=count-n;
        ListNode prev=null;
        temp=head;
        for(int i=0;i<n;i++){
            prev=temp;
            temp=temp.next;
        }
        if(prev!=null) prev.next=temp.next;
        else return head.next;
        return head;
    }
}