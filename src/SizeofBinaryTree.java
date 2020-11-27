public class SizeofBinaryTree {
    public int size(TreeNode root) {
        int counter = 1;
        if(root.left != null && root.right != null){
            counter++;
            counter++;
            return counter+size(root.left) + size(root.right);
        }
        else if(root.left != null){
            return counter+size(root.left);
        }
        else if(root.right != null){
            return counter+size(root.right);
        }


    return 0;


    }
}
