//package Leetcode94;

/*
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Binarytreetraversal {
    public List<Integer>inorderTraversal(TreeNode root){
        
        Stack<TreeNode> stack=new Stack<>();

        List<Integer> output_arr=new ArrayList<>();
    if(root==null){
        return output_arr;
    }
    TreeNode current=root;
    While(current !=null || !stack.isEmpty()){
        while(current!=null){
            stack.push(current);
            current=current.left;
        }
        current=stack.pop();
        output_arr.add(current.val);
        current=current.right;
    }

    return output_arr;


    }

    private void While(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'While'");
    }
}

/* 
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.tree.TreeNode;

public class Binarytreetraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output_arr = new ArrayList<>();
        
        if (root == null) {
            return output_arr;
        }
        
        TreeNode current = root;
        
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getChildAt(0); // Assuming left child is at index 0
            }
            current = stack.pop();
            output_arr.add(current.getUserObject());
            current = current.getChildAt(1); // Assuming right child is at index 1
        }
        
        return output_arr;
    }
    }
*/
