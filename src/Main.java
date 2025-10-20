
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;

import java.util.HashMap;

import datastructures.BinarySearchTree;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;
import datastructures.HashTable;

public class Main {

  public static boolean itemInCommon(int[] array1, int[] array2) {
    HashMap<Integer, Boolean> hm = new HashMap<>();
    for(int item : array1) {
      hm.put(item, true);// value doesn't matter, add the key i.e. the items of array1
    }
    for(int item : array2) {
      if(hm.get(item) != null) {// if item from array2 is found in hashmap, then there is a common item, since all keys in hashmap are from array1 and values are true
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    HashTable ht = new HashTable();
    
    ht.set("paint", 20);
    ht.set("bolts", 40);
    ht.set("nails", 100);
    ht.set("tile", 50);
    ht.set("lumber", 80);

    ht.printTable();

    System.out.println("keys");
    System.out.println(ht.keys());

    int[] array1 = {1,3, 5};
    int[] array2 = {2,4,6};

    System.out.println("item in common : ");
    System.out.println(itemInCommon(array1, array2));
  }

}