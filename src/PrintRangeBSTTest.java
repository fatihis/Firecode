import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class PrintRangeBSTTest {

    @Test
    void printRangeBSTTest(){
        TreeNode left1= new TreeNode(10,null,null);
        TreeNode right1 = new TreeNode(19,null,null);
        TreeNode left = new TreeNode(15,left1,right1);
        TreeNode right = new TreeNode(40,null,null);
        TreeNode root = new TreeNode(20,left,right);
        PrintRangeBST tester = new PrintRangeBST();
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(20);
        arrayList.add(19);
        arrayList.add(40);
        //assertIterableEquals(arrayList,tester.printRange(root,19,40));
    }
}
