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
    public int getDecimalValue(ListNode head) {
        ListNode tmp = head;
        
        String answer = "";
        
        while(tmp != null){
            answer += tmp.val;
            tmp = tmp.next;
        }
        
        return Integer.parseInt(answer, 2);
    }
}