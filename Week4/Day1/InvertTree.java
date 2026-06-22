public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode c=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(c);
        return root;
    }   
}
