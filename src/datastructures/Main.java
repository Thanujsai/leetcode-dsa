package datastructures;
import datastructures.LinkedList.Node;

public class Main {
  public static void main(String[] args) {
    LinkedList myLinkedList = new LinkedList(4);

    myLinkedList.append(5);

    myLinkedList.printList();
    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast());

    System.out.println("checking prepend");
    myLinkedList.prepend(1);
    myLinkedList.prepend(2);
    myLinkedList.prepend(3);

    myLinkedList.printList();

    System.out.println(myLinkedList.removeFirst().value);
    myLinkedList.printList();

    System.out.println(myLinkedList.removeFirst().value);
    myLinkedList.printList();

    System.out.println(myLinkedList.removeFirst().value);
    myLinkedList.printList();

    System.out.println(myLinkedList.removeFirst());
    myLinkedList.printList();

    myLinkedList.append(0);
    myLinkedList.append(1);
    myLinkedList.append(2);
    myLinkedList.printList();

    myLinkedList.set(1, 5);
    myLinkedList.printList();

    System.out.println("inserting");
    myLinkedList.insert(0, 0);
    myLinkedList.printList();

    myLinkedList.insert(2, 3);
    myLinkedList.printList();

    myLinkedList.remove(2);
    myLinkedList.printList();

    myLinkedList.remove(2);
    myLinkedList.append(1);
    myLinkedList.append(3);
    myLinkedList.append(5);
    myLinkedList.printList();

    myLinkedList.reverse();
    myLinkedList.printList();

    System.out.println("middle node is " + myLinkedList.findMiddleNode().value);

    LinkedList loopList = new LinkedList(1);
    loopList.append(2);
    loopList.append(3);
    loopList.append(4);

    LinkedList.Node middle = loopList.getHead().next.next; // Node 3
    loopList.getTail().next = middle; // Create a loop for testing

    // loopList.printList();
    System.out.println("1 -> 2 -> 3 -> 4 -> (loops back to 3)");
    System.out.println("Expected: true");
    System.out.println("Actual: " + loopList.hasLoop());
    System.out.println();

    System.out.println("Finding kth node from end tests");
    myLinkedList = new LinkedList(10);
    myLinkedList.append(20);
    myLinkedList.append(30);
    myLinkedList.append(40);

    myLinkedList.printList();
    Node result = myLinkedList.findKthFromEnd(3);
    System.out.println("Actual: " + (result == null ? "null" : result.value));
    System.out.println();

    System.out.println("remove duplicates test");
    LinkedList duplicateList = new LinkedList(1);
    duplicateList.append(2);
    duplicateList.append(1);
    duplicateList.append(3);
    duplicateList.append(2);

    duplicateList.printList();
    duplicateList.removeDuplicates();
    duplicateList.printList();

  }
}