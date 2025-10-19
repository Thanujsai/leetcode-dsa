
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;
import datastructures.BinarySearchTree;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;

public class Main {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    System.out.println("Binary Search Tree created with root value: " + bst.root);

    bst.insert(47);
    bst.insert(21);
    bst.insert(76);
    bst.insert(18);
    bst.insert(52);
    bst.insert(82);

    bst.insert(27);
    System.out.println("expected location of 27 : bst.root.left.right = " + bst.root.left.right.value);
  }

}