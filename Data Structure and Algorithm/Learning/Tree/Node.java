package src.DataStructure.Tree;

import java.util.ArrayList;

class Node {
    String data;
    Node parent;
    ArrayList <Node> children;

    public Node(String data, Node parent) {
        this.data = data;
        this.parent = parent;
        this.children = new ArrayList<>();
    }
}
