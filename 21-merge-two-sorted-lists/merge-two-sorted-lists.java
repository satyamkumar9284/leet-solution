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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c;
        ListNode h=list1;
        ListNode y=list2;
        int n=0;
        if(h==null){
            return y;
        }
        if(y==null){
            return h;
        }
        while(h.next!=null){
            h=h.next;
        }
        h.next=y;
        h=list1;
        while(h!=null){
            n++;
            h=h.next;
            }
            h=list1;
        for(int i=0;i<=n;i++){
                h=list1;
            while(h!=null && h.next!=null){
            if(h.val>=h.next.val){
            int t=h.val;
            h.val=h.next.val;
            h.next.val=t;
        }
        h=h.next;
        }
        
    }
    return list1;
}}