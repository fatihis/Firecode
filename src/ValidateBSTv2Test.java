import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ValidateBSTv2Test {

    @Test
    void validateBSTTest() {

        TreeNode left1= new TreeNode(10,null,null);
        TreeNode right1 = new TreeNode(19,null,null);
        TreeNode left = new TreeNode(15,left1,right1);
        TreeNode right = new TreeNode(40,null,null);
        TreeNode root = new TreeNode(20,left,right);

        assertEquals(false,ValidateBSTv2.validateBST(root));
    }
}