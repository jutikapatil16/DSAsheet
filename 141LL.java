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

// While traversing we can’t move head therefore creating a new Node and using it to traverse. Therefore dummy is used so that once current reaches at the end it cant return so dummy.next is returned

class Solution {
  public ListNode removeElements(ListNode head, int val) {
   if (head == null) {
          return null;
      }

      ListNode dummy = new ListNode();
      dummy.next = head;
      ListNode cur = dummy;

      while (cur.next != null) {
          if (cur.next.val == val) {
              cur.next = cur.next.next;
              // Here cannot move cur to cur.next as we need to validate the next node.
          } else {
              cur = cur.next;
          }
      }

      return dummy.next;   
  }
}
