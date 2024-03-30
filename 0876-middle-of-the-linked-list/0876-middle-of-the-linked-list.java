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
        int cnt = 0;
        ListNode tmp = head;
        while (tmp != null) {
            cnt++;
            tmp = tmp.next;
        }

        int x = cnt / 2;
        tmp = head;
        for (int i = 0; i < x; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }
}