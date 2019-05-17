package LinkedList;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-16 16:08
 **/
public class LinkedListCycle {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode fastPointer = head.next;
            ListNode lowPointer = head;

            while (lowPointer != fastPointer){
                if (fastPointer.next == null || fastPointer.next.next == null){
                    return false;
                }
                lowPointer = lowPointer.next;
                fastPointer = fastPointer.next.next;

            }
            return true;
        }
    }

}
