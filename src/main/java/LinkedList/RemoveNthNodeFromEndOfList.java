package LinkedList;

/**
 * @author JIANXIN.GUO
 * @date 2018-12-16 14:29
 **/
public class RemoveNthNodeFromEndOfList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
            ListNode fastPointer = head;
            for (int i = 1; i < n; i++) {
                fastPointer = fastPointer.next;
            }
            ListNode lowPointer = dummyHead;
            while (fastPointer.next != null){
                lowPointer = lowPointer.next;
                fastPointer = fastPointer.next;
            }

            lowPointer.next = lowPointer.next.next;

            return dummyHead.next;
        }
    }
}
