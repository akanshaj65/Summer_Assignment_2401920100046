public class PathSum{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null &&root.right==null ){
            return root.val==targetSum;
        }
        boolean ls=hasPathSum(root.left,targetSum-root.val);
         boolean rs=hasPathSum(root.right,targetSum-root.val);
         return ls||rs;
    }
}
