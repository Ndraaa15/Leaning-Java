package src.ASD_HackerRank.MekanikDirSys;
import java.util.*;

public class MekanikDirSys {
    Node root;
    Node pointer;

    MekanikDirSys() {
        root = new Node("root", true);
        pointer = root;
    }

    void mkdir(String name) {
        Node child = pointer.getChild(name);
        if (child != null && child.isFolder) {
            System.out.println("folder already exist");
        } else {
            Node newFolder = new Node(name, true);
            pointer.children.add(newFolder);
        }
    }

    void touch(String name) {
        Node child = pointer.getChild(name);
        if (child != null && !child.isFolder) {
            System.out.println("file already exist");
        } else {
            Node newFile = new Node(name, false);
            pointer.children.add(newFile);
        }
    }

    void cd(String target) {
        if (target.equals("..")) {
            if (pointer != root) {
                pointer = getParent(pointer, root);
            }
        } else {
            Node child = pointer.getChild(target);
            if (child == null || !child.isFolder) {
                System.out.println("folder not found");
            } else {
                pointer = child;
            }
        }
    }

    Node getParent(Node node, Node parent) {
        for (Node child : parent.children) {
            if (child == node) {
                return parent;
            } else {
                Node result = getParent(node, child);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    void ls() {
        List<Node> sortedChildren = new ArrayList<>(pointer.children);
        sortedChildren.sort(Comparator.comparing(node -> node.name));
        for (Node child : sortedChildren) {
            System.out.print(child.name);
            System.out.print(" ");
        }
        System.out.println();
    }

    void rm(String target) {
        boolean found = false;
        Iterator<Node> iterator = pointer.children.iterator();
        while (iterator.hasNext()) {
            Node child = iterator.next();
            if (child.name.equals(target)) {
                iterator.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("target not found");
        }
    }

    void printTree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        if (!node.name.equals("root")){
            System.out.println("-- " + node.name);
        }
        for (Node child : node.children) {
            printTree(child, depth + 1);
        }
    }

    void tree() {
        System.out.println("root");
        printTree(root, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MekanikDirSys system = new MekanikDirSys();

        while (sc.hasNextLine()) {
            String command = sc.nextLine();
            if (command.startsWith("mkdir")) {
                String target = command.substring(6);
                system.mkdir(target);
            } else if (command.startsWith("touch")) {
                String target = command.substring(6);
                system.touch(target);
            } else if (command.startsWith("cd")) {
                String target = command.substring(3);
                system.cd(target);
            } else if (command.startsWith("ls")) {
                system.ls();
            } else if (command.startsWith("rm")) {
                String target = command.substring(3);
                system.rm(target);
            } else if (command.startsWith("tree")) {
                system.tree();
            } else if (command.startsWith("exit")) {
                break;
            }
        }
    }
}

class Node {
    String name;
    boolean isFolder;
    List<Node> children;

    Node(String name, boolean isFolder) {
        this.name = name;
        this.isFolder = isFolder;
        this.children = new ArrayList<>();
    }

    Node getChild(String name) {
        for (Node child : children) {
            if (child.name.equals(name)) {
                return child;
            }
        }
        return null;
    }
}