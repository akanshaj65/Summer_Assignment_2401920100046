public class Inorder {
     public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>l=new ArrayList<>();
        if(root==null){
            return l;
        }
      l.addAll(inorderTraversal(root.left));
       l.add(root.val);
       l.addAll(inorderTraversal(root.right));

      return l;  
    }
    
}
