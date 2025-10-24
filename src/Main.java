
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

    Heap heap2 = new Heap();
    heap2.insert(95);
    heap2.insert(75);
    heap2.insert(80);
    heap2.insert(55);
    heap2.insert(60);
    heap2.insert(50);
    heap2.insert(65);

    System.out.println(heap2.getHeap());

    heap2.remove();
    System.out.println(heap2.getHeap());

    heap2.remove();
    System.out.println(heap2.getHeap());

    heap2.remove();
    System.out.println(heap2.getHeap());


  }

}