public class ValidateBST {

    public static boolean validateBST(TreeNode root) {
    TreeNode tempRoot = root;
    TreeNode tempRootLeft = root;
    TreeNode tempRootRight = root;

    while(tempRootLeft.left != null){
        if(tempRootLeft.left.data > tempRootLeft.data){
            return false;
        }
        tempRootLeft = tempRootLeft.left;
    }
        while(tempRootRight.right != null){
            if(tempRootRight.right.data > tempRootLeft.data){
                return false;
            }
            tempRootLeft = tempRootLeft.right;
        }
        return validateBST(root.left) && validateBST(root.right);

    }
}
