public class findHeightTree {
    public static void main(String[] args) {
        //tests
        TreeNode left1= new TreeNode(10,null,null);
        TreeNode right1 = new TreeNode(19,null,null);
        TreeNode left = new TreeNode(15,left1,right1);
        TreeNode right = new TreeNode(40,null,null);
        TreeNode root = new TreeNode(20,left,right);
        System.out.println(findHeight(root));

    }


    public static int findHeight(TreeNode root) {
        int counter = 0;
        if(root.right != null ){
            counter++;
            findHeight(root.right);
        }
        else if(root.left != null){
            counter++;
            findHeight(root.left);
        }
        else{
            return counter+1;
        }
        return counter+1;
    }
}
