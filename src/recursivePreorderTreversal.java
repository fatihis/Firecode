import java.util.ArrayList;

public class recursivePreorderTreversal {
    ArrayList<Integer> preorderedList = new ArrayList<Integer>();
    public void preorder(TreeNode root) {
        TreeNode ptr = root;
        if(ptr != null){
            preorderedList.add(ptr.data);
            preorder(ptr.left);
            preorder(ptr.right);
        }



    }
}
