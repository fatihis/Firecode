public class deleteHeadNodeCircularLinkedList {

    public static ListNode deleteAtHead(ListNode head) {
        int value = head.data;
        ListNode ptr = head;
        if(head == null && head.next == null){
            return null;
        }
        while(ptr.next != null){
            ptr = ptr.next;
            if(ptr.next.data == value){
            ptr.next = ptr.next.next;
            break;
            }
        }
        return head.next;
    }

}
