package remove_nth_from_end;

public class Main {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode p = temp;
        ListNode q = temp;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }

        while (p.next != null) {
            q = q.next;
            p = p.next;
        }

        q.next = q.next.next;
        return temp.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

