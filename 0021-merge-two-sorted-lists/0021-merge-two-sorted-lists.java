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
        ListNode res = new ListNode();
        ListNode cur = res;
        while (list1!=null && list2 !=null){
            
            if (list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
                // System.out.println(list2.val);
            }
            cur = cur.next;
        }

        cur = (list1 !=null ) ? list1 : list2;
        return res.next;
    }
}