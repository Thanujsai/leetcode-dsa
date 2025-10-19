package datastructures;

public class BinarySearchTree {

    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right; 

        public Node(int value) {
            this.value = value;
        }
    }

    public Boolean insert(int value) {
        Node node = new Node(value);
        if(root == null) {
            root = node;
            return true;
        }
        Node temp = root;
        while(true) {
            if(node.value == temp.value) return false;
            if(node.value < temp.value) {
                if(temp.left == null) {
                    temp.left = node;
                    return true;
                }
                else {
                    temp = temp.left;
                }
            }
            else {
                if(temp.right == null) {
                    temp.right = node;
                    return true;
                }
                else {
                    temp = temp.right;
                }
            }
        }
    }

    // public BinarySearchTree(int value) {
    //     Node node = new Node(value);
    //     root = node;
    // }
}
