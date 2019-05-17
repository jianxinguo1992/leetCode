package LinkedList;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-16 10:34
 **/
public class MergeTwoSortedLists {

    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode newMergeTwoLists = result;
            while (l1 != null || l2 != null) {
                if (l1 != null && l2 != null) {
                    int difference = l1.val - l2.val;
                    if (difference >= 0) {
                        newMergeTwoLists.next = new ListNode(l2.val);
                        l2 = l2.next;
                    } else if (difference < 0) {
                        newMergeTwoLists.next = new ListNode(l1.val);
                        l1 = l1.next;
                    }
                    newMergeTwoLists = newMergeTwoLists.next;
                }else if (l1 == null){
                    newMergeTwoLists.next = new ListNode(l2.val);
                    newMergeTwoLists = newMergeTwoLists.next;
                    l2 = l2.next;
                }else {
                    newMergeTwoLists.next = new ListNode(l1.val);
                    newMergeTwoLists = newMergeTwoLists.next;
                    l1 = l1.next;
                }
            }
            return result.next;
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
