public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    private TreeNode buildTree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer>map){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        int inroot=map.get(root.val);
        int innums=inroot-inStart;
        root.left=buildTree(preorder,preStart+1,preStart+innums,inorder,inStart,inroot-1,map);
        root.right=buildTree(preorder,preStart+innums+1,preEnd,inorder,inroot+1,inEnd,map);
        return root;
    }
}
