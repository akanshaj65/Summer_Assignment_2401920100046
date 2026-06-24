public class IsValid {
    private boolean valid (TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }
         if(min != null && root.val<=min.val){
            return false;
        }
        if(max != null && root.val>=max.val){
            return false;
        }
        
        return valid(root.left,min,root) && valid(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        TreeNode min=null;
        TreeNode max=null;
        return valid(root,min,max);   
    }
    
}
