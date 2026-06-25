public class MaxPathSum{
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {    
        max(root);
        return maxSum;    
    }
    private int max(TreeNode root){       
        if(root==null){
            return 0;
        }
        int ls=Math.max(0,max(root.left));
        int rs=Math.max(0,max(root.right));
         maxSum=Math.max(maxSum,ls+rs+root.val);
        return Math.max(ls,rs)+root.val;

    }
}
