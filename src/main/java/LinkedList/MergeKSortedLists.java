package LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-16 16:39
 **/
public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < lists.length; i++) {
            ListNode listNode = lists[i];
            while (listNode != null){
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }
        list.sort((i1, i2) -> i1.compareTo(i2));

        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        for (Integer val : list){
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return listNode.next;
    }
}
