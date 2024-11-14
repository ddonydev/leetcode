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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode newNode = new ListNode(0);
        ListNode result = newNode;
        int sum = 0;
        while (curr.next != null){
            if(curr.val != 0){
                sum += curr.val;
                if(curr.next.val == 0){
                    result.next = new ListNode(sum);
                    result = result.next;
                }
            }else{
                sum = 0;
            }
            curr = curr.next;
        }
        
        return newNode.next;
    }
}