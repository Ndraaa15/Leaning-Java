package src.DataStructure.Tree;

class Tree {
    Node root;
    Node current;
    int size = 0;

    boolean isEmpty (){
        return size == 0;
    }

    void add (String data){
        if (isEmpty()){
            root = new Node(data, null);
            current = root;
        }else {
            for (Node child: current.children) {
                if (child.data.equals(data)){
                    System.out.println("Data already exist");
                    return;
                }
            }
            current.children.add(new Node(data, current));
        }
        size++;
    }

    //Removing in same level
    void remove (String data){
        Node temp = null;
        if (isEmpty()){
            System.out.println("Tree still empty");
        }else {
            for (Node child: current.children) {
                if (child.data.equals(data)){
                    temp = child;
                }
            }
            current.children.remove(temp);
            System.out.println("Sorry, data doesn't exist in this level");
        }
        size--;
    }

    void search (String data){
        if (isEmpty()){
            System.out.println("Tree still empty");
        }else {
            if (root.data.equals(data)){
                System.out.println("Data found in level "  + 1);
            }else {
                recursiveSerch(data, root, 1);
            }
        }
    }

    void recursiveSerch (String data, Node parent, int i){
        for (Node child : parent.children) {
            if (child.data.equals(data)){
                System.out.println("Parent : " + parent.data);
                System.out.println("Data found in level " + (i + 1));
                return;
            }else{
                recursiveSerch(data, child, i + 1);
            }
        }
        System.out.println("Sorry data doesn't exist");
    }

    void printTree (){
        if (isEmpty()){
            System.out.println("Tree still empty");
            return;
        }
        recursivePrintTree(root,"", true);
    }

    void recursivePrintTree (Node parent, String prefix, boolean isLast){
        System.out.print(prefix);
        System.out.print(isLast ? "└── " : "├── ");
        System.out.println(parent.data);

        for (int i = 0; i < parent.children.size() - 1; i++) {
            Node child = parent.children.get(i);
            recursivePrintTree(child, prefix + (isLast ? "    " : "│   "),false);
        }

        if (parent.children.size() > 0){
            Node lastChild = parent.children.get(parent.children.size() - 1);
            recursivePrintTree(lastChild, prefix + (isLast ? "    " : "│   "), true);
        }
    }

    int getHeight (){
        int level = 0;
        if (isEmpty()){
            return level;
        }else {
            level = recursiveGetHeight(root, 1);
        }
        return level;
    }

    int recursiveGetHeight (Node parent, int i){
        int level = 0;
        if (parent.children.size() == 0){
            return i;
        }
        for(Node child : parent.children){
            level = Math.max(recursiveGetHeight(child, i + 1), level);
        }
        return level;
    }

    int getSize (){
        return size;
    }

    void moveTo (String data){
        if (isEmpty()){
            System.out.println("Tree still empty");
        } else if (data.equals("..")) {
            current = current.parent;
        } else {
            if (root.data.equals(data)){
                current = root;
            }else {
                recursiveMoveTo(data, root);
            }
        }
    }

    void recursiveMoveTo (String data, Node parent){
        for (Node child : parent.children) {
            if (child.data.equals(data)){
                current = child;
                return;
            }else {
                recursiveMoveTo(data, child);
            }
        }
    }

    String getCurrent (){
        return current.data;
    }
    String getRoot (){
        return root.data;
    }
}
