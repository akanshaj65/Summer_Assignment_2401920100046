public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode ls=lowestCommonAncestor(root.left,p,q);
        TreeNode rs=lowestCommonAncestor(root.right,p,q);
        if(ls!=null && rs!=null){
            return root;
        }
        return ls!=null ?ls:rs;    
    }
    
}
