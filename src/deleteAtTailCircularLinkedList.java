public class deleteAtTailCircularLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode newNode1 = new ListNode(2);
        ListNode newNode2 = new ListNode(3);
        head.next = newNode1;
        newNode1.next = newNode2;
        newNode2.next = head;
        deleteAtTail(head);
    }
    public static ListNode deleteAtTail(ListNode head) {
        ListNode ptr = head;
        if(head == null || head.next == null){
            return null;
        }
        while (ptr.next != null) {
            ptr = ptr.next;
            if (ptr.next.next == head) {
                ptr.next = head;
                break;
            }
        }

        return head;
    }


}
