import java.util.List;

public class isListEvenSLL {
    public Boolean isListEven(ListNode head) {
        ListNode ptr = head;
        int counter = 0;
        while (ptr.next != null) {
            ptr = ptr.next;
            counter++;
        }
        if(counter % 2 == 0 ){
            return false;
        }
        else{
            return true;
        }
    }
}
