public class ValidateBSTv2 {

    public static boolean validateBST(TreeNode root) {

        if (root == null) {
            return false;
        }
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        return validateBSTMinMax(root, minVal, maxVal);

    }

    private static boolean validateBSTMinMax(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min) {
            return false;
        }
        if (node.data > max) {
            return false;
        }
        return validateBSTMinMax(node.left, min, node.data - 1) && validateBSTMinMax(node.right, node.data + 1, max);
    }
}
