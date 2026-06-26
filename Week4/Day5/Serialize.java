package Summer_Assignment_2401920100046.Week4.Day5;

import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Serialize {
    private int i;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder sb=new StringBuilder();
        Stack<TreeNode>s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr=s.pop();
            if (curr == null) {
                sb.append("n,");
                continue;
            }
            sb.append(curr.val).append(",");
            s.push(curr.right);
            s.push(curr.left);
        }   
        return sb.toString();    
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int i=0;
        String arr[]=data.split(",");
        return buildTree(arr);
    }
    private TreeNode buildTree(String arr[]){
        if(i>=arr.length || arr[i].equals("n")){
            i++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(arr[i++]));
        root.left=buildTree(arr);
        root.right=buildTree(arr);
        return root;

    }
}
