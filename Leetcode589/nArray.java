/*
import java.text.CollationKey;
import java.util.LinkedList;


class Node{
    public int val;
    public List<Node> children;
    public Node() {}

    public Node(int _val,List<Node> _children){
        val= _val;
        children= _children;
    }
};

public class nArray{
    public List<Integer> preorder(Node root){
        LinkedList<Node> stack=new LinkedList<>();
        LinkedList<Integer> output_arr=new LinkedList<>();


        if(root==null){
            return output_arr;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node node=stack.pullLast();
            output_arr.add(node.val);
            Collections.reverse(node.children);
            for(Node child:node.children){
                stack.add(child);
            }
        }
        return output_arr;
    }
}*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Node{
    public int val;
    public List<Node> children;
    public Node() {}

    public Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    }
}

public class nArray {
    public List<Integer> preorder(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_arr = new LinkedList<>();

        if (root == null) {
            return output_arr;
        }
        
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output_arr.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return output_arr;
    }

    public static void main(String[] args) {
       
        Node child1 = new Node(5, new LinkedList<>());
        Node child2 = new Node(6, new LinkedList<>());
        Node child3 = new Node(9, new LinkedList<>());
        List<Node> children = new LinkedList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        
        Node root = new Node(1, children);

        nArray nArray = new nArray();
        List<Integer> result = nArray.preorder(root);

        System.out.println(result);  
    }
}
