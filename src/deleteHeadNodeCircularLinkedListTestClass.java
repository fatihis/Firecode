import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class deleteHeadNodeCircularLinkedListTestClass {

    @Test
    void deleteNodeCircularTest(){
        ListNode head = new ListNode(1);
        ListNode newNode1 = new ListNode(2);
        ListNode newNode2 = new ListNode(3);
        head.next = newNode1;
        newNode1.next = newNode2;
        newNode2.next = head;

       assertEquals(newNode1,deleteHeadNodeCircularLinkedList.deleteAtHead(head));
    }
}
