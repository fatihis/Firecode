public class insertAtHead {
    public ListNode insertAtHead(ListNode head, int data) {
        ListNode newHead =new ListNode(data);
        newHead.next = head;
        return newHead;
    }
}
