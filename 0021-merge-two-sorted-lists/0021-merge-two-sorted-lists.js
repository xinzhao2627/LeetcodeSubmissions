/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    let list3 = new ListNode();
    let c = list3;

    while (list1 && list2){
        if (list1.val > list2.val){
            c.next = list2;
            list2 = list2.next;
        } else {
            c.next = list1;
            list1 = list1.next;
        }
        c = c.next;
    }

    c.next = list1 || list2;

    return list3.next;
};