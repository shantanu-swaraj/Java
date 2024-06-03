//package Leetcode590;

import java.util.LinkedList;
import java.util.List;

class Node{
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val,List<Node> _children){
        val= _val;
        children=_children;
    }
};
public class N_array {
    public List<Integer> postorder(Node root){
        LinkedList<Node> stack=new LinkedList<>();
        LinkedList<Integer> output_arr=new LinkedList<>();

        if(root==null){
            return output_arr;
        }

        stack.add(root);
        while(!stack.isEmpty()){
            Node node=stack.pollLast();
            output_arr.addFirst(node.val);
            for(Node child:node.children){
                stack.add(child);
            }
        }
        return output_arr;
    }
    public static void main(String[] args) {
        // Creating an N-ary tree for testing
        Node child1 = new Node(5, new LinkedList<>());
        Node child2 = new Node(6, new LinkedList<>());
        List<Node> children1 = new LinkedList<>();
        children1.add(child1);
        children1.add(child2);

        Node root = new Node(1, children1);

        N_array nArray = new N_array();
        List<Integer> result = nArray.postorder(root);
        System.out.println("Postorder traversal: " + result);
    }
}


