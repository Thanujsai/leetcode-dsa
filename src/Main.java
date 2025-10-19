
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;
import datastructures.BinarySearchTree;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;
import datastructures.HashTable;

public class Main {
  public static void main(String[] args) {
    HashTable ht = new HashTable();
    
    ht.set("nails", 100);
    ht.set("tile", 50);
    ht.set("lumber", 80);
    ht.set("bolts", 200);
    ht.set("screws", 140);

    ht.printTable();
  }

}