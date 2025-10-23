
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

public class Main {

  public static void main(String[] args) {
    Graph graph = new Graph();

    graph.addVertex("A");
    graph.printGraph();

    graph.addVertex("B");
    graph.printGraph();

    graph.addEdge("A", "B");
    graph.printGraph();

    graph.addVertex("C");
    graph.addEdge("A", "C");
    graph.addEdge("B", "C" );

    graph.printGraph();

    graph.removeEdge("A", "C");
    graph.printGraph();

    graph.removeEdge("B", "C");
    graph.printGraph();

    Graph newGraph = new Graph();
    newGraph.addVertex("A");
    newGraph.addVertex("B");
    newGraph.addVertex("C");
    newGraph.addVertex("D");

    newGraph.addEdge("A", "B");
    newGraph.addEdge("A", "C");
    newGraph.addEdge("A", "D");

    newGraph.addEdge("C", "D");
    newGraph.addEdge("D", "B");

    newGraph.printGraph();

    System.out.println("Removing vertex D");
    newGraph.removeVertex("D");
    newGraph.printGraph();



  }

}