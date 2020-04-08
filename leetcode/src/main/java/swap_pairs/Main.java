package swap_pairs;


public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        Main main = new Main();
        head.next = a;
        a.next = b;
        b.next = c;
        ListNode listNode = main.swapPairs(head);
        while (listNode.next != null) {
            System.out.print(listNode.val + "-->");
            listNode = listNode.next;
        }
        System.out.print(listNode.val);
    }
    //用递归的方式解题
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x;}
    }
}
