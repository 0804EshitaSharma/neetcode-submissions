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

 public int findLength(ListNode head){
    int l = 1;
     ListNode tmp = head;
    while(tmp != null && tmp.next != null){
        tmp = tmp.next;
        l++;
    }
    return l;
 }

    public ListNode removeNthFromEnd(ListNode head, int n) {
       int length = findLength(head);

       int pos = length - n;

       if(pos == 0){
        return head.next;
       }


       int i = 0;
       ListNode tmp = head;
   

       while(i != pos-1 && tmp != null){
        tmp = tmp.next;
        i++;

       }

       if(tmp != null && tmp.next != null){
       ListNode node = tmp.next;
       tmp.next = node.next;
       node.next = null;
       }

       return head;
    }
}
