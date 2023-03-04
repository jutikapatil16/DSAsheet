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


// In deleting node , we are just traversing current but here two linkedlists are to be considered therefore pre head is taken (not joined to any ONE list and joined after a condition).

class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode prehead = new ListNode(-1);
      ListNode cur = prehead;

      while (l1 != null && l2 != null) {
          if (l1.val <= l2.val) {
              cur.next = l1;
              l1 = l1.next;
          } else {
              cur.next = l2;
              l2 = l2.next;
          }
          cur = cur.next;
      }

      cur.next = l1 == null ? l2 : l1;
      return prehead.next;
  }
}
