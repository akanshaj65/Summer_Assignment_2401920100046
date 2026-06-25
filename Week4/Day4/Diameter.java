public class Diameter {
     int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
       height(root);
       return max;
        
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        max=Math.max(lh+rh,max);
        return Math.max(lh,rh)+1;
    }
}
