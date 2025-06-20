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
    public void recursion(ListNode cur, ListNode prev){
        if (cur == null) return;

        ListNode tmp = cur.next;
        cur.next = prev;
        recursion(tmp, prev);
    }
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null){
            ListNode tmp = cur.next;
            cur.next =  prev;
            prev = cur;
            cur =  tmp;
        }
        // recursion(cur, prev);
        return prev;
    }
}