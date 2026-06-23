public class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return l;
        }
        q.add(root);
        boolean reverse=true;
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer>s=new ArrayList<>();
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
            if(!reverse){
                Collections.reverse(s);
            }
            l.add(s);
            reverse=!reverse;
        }
        return l;

    }
    
}
