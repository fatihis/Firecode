public class findNodeBinaryTree {
    public TreeNode findNode(TreeNode root, int val) {
        //without recursion?
        //Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.
        TreeNode ptrL = root;
        while(ptrL.left != null){
            if(ptrL.data == val){
                return ptrL;
            }
            if(ptrL.right.data == val){
                return ptrL.right;
            }
            ptrL = ptrL.left;
        }
        TreeNode ptrR = root;
        while(ptrR.right != null){
            if(ptrR.data == val){
                return ptrR;
            }
            if(ptrR.left.data == val){
                return ptrR.left;
            }
        }
        return null;
    }
}
