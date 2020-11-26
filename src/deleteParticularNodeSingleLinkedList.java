public class deleteParticularNodeSingleLinkedList {
    public static ListNode deleteAtMiddle(ListNode head, int position) {
        /*Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head position) and return the head of the list. Do nothing if the input position is out of range.*/
        if(head == null){
            return null;
        }
        ListNode ptr = head;
        int cnt = 1;
        while(ptr.next != null){
            if(cnt == position-1){
                ptr.next = ptr.next.next;
                return head;
            }
            ptr = ptr.next;
            cnt++;
        }

        return null;
    }
}
