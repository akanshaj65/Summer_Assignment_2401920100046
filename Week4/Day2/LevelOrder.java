public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             List<Integer>s=new ArrayList<>();
            int level=q.size();
            for(int i=0;i<level;i++){
                TreeNode curr=q.remove();
                s.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }    
            }
            l.add(s);     
        }
        return l;    
    }
}
