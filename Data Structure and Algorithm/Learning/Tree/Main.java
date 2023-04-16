package src.DataStructure.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add("A"); //As a root because the first adding in level zero (0)
        tree.add("B");
        tree.add("C");
        tree.add("D");
        tree.add("E");
        tree.moveTo("E");
        tree.add("F");
        tree.moveTo("F");
        tree.add("G");
        tree.remove("G");
        tree.search("G");
        tree.printTree();
        System.out.println(tree.getHeight());
        System.out.println(tree.getSize());
    }
}
