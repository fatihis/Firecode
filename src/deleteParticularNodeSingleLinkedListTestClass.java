import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class deleteParticularNodeSingleLinkedListTestClass {
@Test
    void deleteNodeTest(){
    ListNode head = new ListNode(1);
    ListNode newNode1 = new ListNode(2);
    ListNode newNode2 = new ListNode(3);
    head.next = newNode1;
    newNode1.next = newNode2;

    assertEquals(head,deleteParticularNodeSingleLinkedList.deleteAtMiddle(head,2));
}
}
