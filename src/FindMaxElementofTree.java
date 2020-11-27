public class FindMaxElementofTree {
    public int findMax(TreeNode root) {
        int select = 0;
        if(root.left != null && root.right != null){

        if(root.left.data > root.right.data){
            select = 1;
        }
        else if(root.right.data > root.left.data){
            select = 2;
        }
        else {
            select = 3;
        }

        }
        switch (select){
            case 1:if(root.left.data > root.data) return findMax(root.left);
            break;
            case 2:if(root.right.data > root.data ) return findMax(root.right);
            break;
            case 3:return root.data;
        }
    return root.data;
    }
}
