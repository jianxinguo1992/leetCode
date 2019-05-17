package LinkedList;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-16 10:20
 **/
public class MiddleLinkedList {
    static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fastPointer = head;
            ListNode slowPointer = head;

            while (fastPointer.next != null){
                slowPointer = slowPointer.next;
                if (fastPointer.next.next != null){
                    fastPointer = fastPointer.next.next;
                }else {
                    fastPointer = fastPointer.next;
                }
            }

            return slowPointer;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
