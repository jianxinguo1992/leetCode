package LinkedList;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-13 10:03
 **/
public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            ListNode p = l1;
            ListNode y = l2;
            int carry = 0;
            while (p != null || y != null){
                int x = p != null ? p.val : 0;
                int z = y != null ? y.val : 0;

                int sum = carry + x + z;

                carry = sum / 10;

                curr.next = new ListNode(sum % 10);
                curr = curr.next;

                if (p != null) p = p.next;
                if (y != null) y = y.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }

            return dummyHead.next;
        }
    }
//        public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
//
//            List<Integer> listNodeValue2List1 = getListNodeValue2List(l1);
//            List<Integer> listNodeValue2List2 = getListNodeValue2List(l2);
//            Long count1 = sumList(listNodeValue2List1);
//            Long count2 = sumList(listNodeValue2List2);
//            Long count = count1 + count2;
//            ListNode dummyRoot = new ListNode(0);
//            ListNode ptr = dummyRoot;
//            byte[] bytes = count.toString().getBytes();
//            for (int i = bytes.length; i > 0; i--) {
//                String s = new String(bytes, i - 1, 1);
//                ptr.next = new ListNode(Integer.valueOf(s));
//                ptr = ptr.next;
//            }
//            return dummyRoot.next;
//        }
//
//
//        public long sumList(List<Integer> list) {
//
//            Long count = Long.valueOf(0);
//            if (list.size() > 0) {
//                count = count + list.get(0);
//            }
//            for (int i = 1; i < list.size(); i++) {
//                long i1 = (long) (list.get(i) * Math.pow(10, i));
//                count = count + i1;
//            }
//            return count.longValue();
//        }
//
//
//        public List<Integer> getListNodeValue2List(ListNode listNode) {
//            List<Integer> list1 = new ArrayList();
//            ListNode listNode1 = listNode;
//            while (listNode1.next != null) {
//                ListNode next = listNode1.next;
//                list1.add(listNode1.val);
//                listNode1 = next;
//            }
//            list1.add(listNode1.val);
//            return list1;
//        }
//    }
}
