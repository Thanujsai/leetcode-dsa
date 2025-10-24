
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import datastructures.BinarySearchTree;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;
import datastructures.Graph;
import datastructures.HashTable;
import datastructures.Heap;

public class Main {

  public static void main(String[] args) {
    Heap heap = new Heap();
    heap.insert(99);
    heap.insert(72);
    heap.insert(61);
    heap.insert(58);

    System.out.println(heap.getHeap());

    heap.insert(100);
    System.out.println(heap.getHeap());

    heap.insert(75);
    System.out.println(heap.getHeap());


  }

}