package src.DataStructure.BinaryTree;

import java.util.*;

public class BinaryTree {
    //Link Learning : https://youtu.be/fAAZixBzIAI

    //Characteristic of Binary Tree :
    //Each node at most have 2 node
    //Exactly one root
    //Exactly one node from root to any node
    //Empty tree is a part of binary tree

    //Transversal Binary Tree -> the process of visiting each node in the binary tree systematically and sequentially.

    //Pre-Order
    //1) Print root
    //2) Recursive to root.left
    //3) Recursive to root.right

    //In-Order
    //1) Recursive to root.left
    //2) Print root
    //3) Recursive to root.right

    //Post-Order
    //1) Recursive to root.left
    //2) Recursive to root.right
    //3) Print root

    public static void main(String[] args) {
        Node  a = new Node("A");
        Node  b = new Node("B");
        Node  c = new Node("C");
        Node  d = new Node("D");
        Node  e = new Node("E");
        Node  f = new Node("F");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        //             A
        //           /  \
        //         B       C
        //        / \     /
        //      D     E  F


        //dephtFirstValue -> explore the binary tree until the leaf in left subtree
        System.out.println("Depth First Search : ");
        ArrayList <Object> depthFirstValue = depthFirstValue (a);
        for (Object node: depthFirstValue) {
            System.out.println(node);
        }

        //breadthFirstValue -> explore the binary tree from root to all child first using queue
        System.out.println("Breadth First Search : ");
        ArrayList <Object> breadthFirstValue = breadthFirstValue(a);
        for (Object node: breadthFirstValue) {
            System.out.println(node);
        }

        //pre-order
        System.out.println("pre-order : ");
        PreOrder(a);

        //in-order
        System.out.println("in-order : ");
        InOrder(a);

        //post-order
        System.out.println("post-order : ");
        PostOrder(a);

        Object target= "Z";
        System.out.println("Target : " + target);
        System.out.println("is " + target + " exits in tree ? " + treeIncludeBFS(a, target));
        System.out.println("is " + target + " exits in tree ? " + treeIncludeRecursive(a, target));

    }

    static ArrayList<Object> depthFirstValue(Node root){
        ArrayList <Object> result = new ArrayList<>();
        Stack <Node> stack = new Stack<>();
        if (root != null){
            stack.push(root);
        }else {
            return new ArrayList<>();
        }
        while (stack.size() > 0){
            Node current = stack.pop();
            result.add(current.data);

            if (current.right != null) stack.push(current.right);
            if (current.left !=  null) stack.push(current.left);
        }
        return result;
    }

    static ArrayList<Object> breadthFirstValue(Node root){
        ArrayList <Object> result = new ArrayList<>();
        Queue <Node> queue = new LinkedList<>();
        if (root != null){
            queue.add(root);
        }else {
            return new ArrayList<>();
        }
        while (queue.size() > 0){
            Node current = queue.remove();
            result.add(current.data);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return result;
    }

    static void PreOrder (Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    static void InOrder (Node root){
        if (root == null){
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    static void PostOrder (Node root){
        if (root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }

    static boolean treeIncludeBFS (Node root, Object target){
        boolean result = false;
        Queue <Node> queue = new LinkedList<>();
        if (root != null){
            queue.add(root);
        }else {
            return false;
        }
        while (queue.size() > 0){
            Node current = queue.remove();
            if (current.data == target ){
                result = true;
                break;
            }
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return result;
    }

    static boolean treeIncludeRecursive (Node root, Object target){
        if (root == null){
            return false;
        }
        if (root.data == target){
            return  true;
        }
        return treeIncludeRecursive(root.left, target) || treeIncludeRecursive(root.right, target);
    }

    static void maxRootToLeaf (Node root){

    }


//    static int treeSum (Node root){
//        if (root == null){
//            return 0;
//        }
//
//        return root.data + treeSum(root.left) +treeSum(root.right);
//    }
//    We can also use BFS or DFS

//    static int minValueBFS (Node root){
//        if (root == null){
//            return 0;
//        }
//        int minValue = Integer.MAX_VALUE;
//        Queue <Node> queue = new LinkedList<>();
//
//        queue.add(root);
//
//        while (queue.size() > 0){
//            Node current = queue.remove();
//            if (current.data < minValue){
//                minValue = current.data;
//            }
//
//            if (current.left != null) queue.add(current.left);
//            if (current.right != null) queue.add(current.right);
//        }
//        return minValue;
//    }

//    static int minValueRecursive (Node root){
//        if (root == null){
//            return 0;
//        }
//        int minLeft = minValueRecursive(root.left);
//        int minRight = minValueRecursive(root.right);
//        return Math.min(root.data, Math.min(minLeft, minRight));
//    }

//    static int maxPathSum (Node root){
//        if (root == null){
//            return Integer.MIN_VALUE;
//        } else if (root.left == null && root.right == null) {
//            return root.data;
//        }
//        int maxChild = Math.max(maxPathSum(root.left), maxPathSum(root.right));
//        return root.data + maxChild;
//    }

}
