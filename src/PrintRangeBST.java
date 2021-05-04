import java.util.ArrayList;
import java.util.Collections;

public class PrintRangeBST {

    public ArrayList<Integer> rangeList = new ArrayList<Integer>();

    public  void printRange(TreeNode root, int a, int b) {
        if(root == null){
            Collections.sort(rangeList);
            return;
        }
        TreeNode initNode = root;
        if(initNode.data >= a && initNode.data <= b){
            rangeList.add(initNode.data);
        }
        if(initNode.left != null && initNode.data >= a) {
            printRange(initNode.left, a , b);
        }
        if(initNode.left != null && initNode.data <= b) {
            printRange(initNode.right, a , b);
        }

    }


}
