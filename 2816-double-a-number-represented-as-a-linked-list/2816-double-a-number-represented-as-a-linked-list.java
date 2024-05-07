import java.math.BigInteger;
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
    public ListNode doubleIt(ListNode head) {
        
        String n = "";
        while(head != null){
            n += String.valueOf(head.val);
            head = head.next;
        }

        BigInteger result = new BigInteger(n);
        result = result.multiply(new BigInteger("2"));
        
        if(result.compareTo(new BigInteger("0")) == 0){
            return new ListNode(0, head);
        }

        while(result.compareTo(new BigInteger("0")) > 0){
            int val = (result.mod(new BigInteger("10")).intValue());
            head = new ListNode(val, head);
            result = result.divide(new BigInteger("10"));
        }
        return head;
    }
}