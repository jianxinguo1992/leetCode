package LinkedList;

/**
 * @author JIANXIN.GUO
 * @date 2018-12-16 14:29
 **/
public class ReverseLinkedList {

  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  static class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null){
        return null;
      }
      ListNode reverseNode = null;
      ListNode cur = head;
      while (cur.next != null){
        ListNode next = cur.next;
        cur.next = reverseNode;
        reverseNode = cur;
        cur = next;
      }
      cur.next = reverseNode;

      return cur;
    }
  }
}
