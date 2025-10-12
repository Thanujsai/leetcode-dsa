
import datastructures.LinkedList;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;

public class Main {
  public static void main(String[] args) {
    DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(5);

    myDoublyLinkedList.getHead();
    myDoublyLinkedList.getTail();
    myDoublyLinkedList.getLength();

    myDoublyLinkedList.printList();

    myDoublyLinkedList.append(10);
    myDoublyLinkedList.printList();

    myDoublyLinkedList.append(15);
    myDoublyLinkedList.append(20);

    System.out.println("before remove last");

    myDoublyLinkedList.printList();

    myDoublyLinkedList.removeLast();
    System.out.println("after remove last");
    myDoublyLinkedList.printList();

    System.out.println(myDoublyLinkedList.removeLast().value + " was removed");

    myDoublyLinkedList.printList();

    System.out.println(myDoublyLinkedList.removeLast().value + " was removed");

    myDoublyLinkedList.printList();

    System.out.println(myDoublyLinkedList.removeLast().value + " was removed");

    myDoublyLinkedList.printList();

    myDoublyLinkedList.append(3);
    myDoublyLinkedList.printList();

    System.out.println("prepending 2");
    myDoublyLinkedList.prepend(2);
    myDoublyLinkedList.printList();

    System.out.println("prepending 1");
    myDoublyLinkedList.prepend(1);
    myDoublyLinkedList.printList();

    System.out.println("removing first");
    System.out.println(myDoublyLinkedList.removeFirst().value + " was removed");
    myDoublyLinkedList.printList();

    System.out.println("removing first");
    System.out.println(myDoublyLinkedList.removeFirst().value + " was removed");
    myDoublyLinkedList.printList();

    System.out.println("removing first");
    System.out.println(myDoublyLinkedList.removeFirst().value + " was removed");
    myDoublyLinkedList.printList();

    System.out.println("removing first");
    System.out.println(myDoublyLinkedList.removeFirst() + " was removed");
    myDoublyLinkedList.printList();

    myDoublyLinkedList.append(1);
    myDoublyLinkedList.append(2);
    myDoublyLinkedList.append(3);
    myDoublyLinkedList.append(4);

    myDoublyLinkedList.printList();
    System.out.println("Element on index 2 is : " + myDoublyLinkedList.get(2).value);

    myDoublyLinkedList.set(2, 99);
    System.out.println("Element on index 2 after set is : " + myDoublyLinkedList.get(2).value);

    DoublyLinkedList myDoublyLinkedList2 = new DoublyLinkedList(1);
    myDoublyLinkedList2.append(2);
    myDoublyLinkedList2.append(4);
    myDoublyLinkedList2.append(5);

    System.err.println("before insertion at index 2");
    myDoublyLinkedList2.printList();

    myDoublyLinkedList2.insert(2, 3);

    System.out.println("after insertion at index 2");
    myDoublyLinkedList2.printList();

    myDoublyLinkedList2.remove(2);
    System.out.println("after removal at index 2");
    myDoublyLinkedList2.printList();

    myDoublyLinkedList2.remove(0);
    System.out.println("after removal at index 0");
    myDoublyLinkedList2.printList();

    myDoublyLinkedList2.remove(2);
    System.out.println("after removal at index 2");
    myDoublyLinkedList2.printList();

    // Test 5: Odd-length palindrome (1 <-> 2 <-> 3 <-> 2 <-> 1)
    System.out.println("Test 5: Odd-Length Palindrome");
    DoublyLinkedList myList;

    myList = new DoublyLinkedList(1);
    myList.append(2);
    myList.append(3);
    myList.append(2);
    myList.append(1);
    System.out.print("List: ");
    myList.printList();
    System.out.println("Expected: true");
    System.out.println("Actual: " + myList.isPalindrome());
    System.out.println();

    // Test 6: Even-length palindrome (1 <-> 2 <-> 2 <-> 1)
    System.out.println("Test 6: Even-Length Palindrome");
    myList = new DoublyLinkedList(1);
    myList.append(2);
    myList.append(2);
    myList.append(1);
    System.out.print("List: ");
    myList.printList();
    System.out.println("Expected: true");
    System.out.println("Actual: " + myList.isPalindrome());
    System.out.println();

    // Test 3: Multiple nodes after append
    System.out.println("Test 3: Multiple Nodes (After Append)");
    DoublyLinkedList dll;

    dll = new DoublyLinkedList(1);
    dll.append(2);
    dll.append(3);
    dll.append(4);
    dll.append(5);
    System.out.println("Expected Forward: 1 <-> 2 <-> 3 <-> 4 <-> 5");
    System.out.println("Expected Backward: 5 <-> 4 <-> 3 <-> 2 <-> 1");
    printForward(dll);
    printBackward(dll);
    System.out.println();

    // Test 4: Reverse an even-length list
    System.out.println("Test 4: Reverse Even-Length List");
    dll = new DoublyLinkedList(1);
    dll.append(2);
    dll.append(3);
    dll.append(4);
    dll.reverse();
    System.out.println("Expected Forward: 4 <-> 3 <-> 2 <-> 1");
    System.out.println("Expected Backward: 1 <-> 2 <-> 3 <-> 4");
    printForward(dll);
    printBackward(dll);
    System.out.println();

    // Test 5: Reverse an odd-length list
    System.out.println("Test 5: Reverse Odd-Length List");
    dll = new DoublyLinkedList(1);
    dll.append(2);
    dll.append(3);
    dll.append(4);
    dll.append(5);
    dll.reverse();
    System.out.println("Expected Forward: 5 <-> 4 <-> 3 <-> 2 <-> 1");
    System.out.println("Expected Backward: 1 <-> 2 <-> 3 <-> 4 <-> 5");
    printForward(dll);
    printBackward(dll);
    System.out.println();

    // Test 6: Mixed nodes
        System.out.println("Test 6: Mixed Nodes");
        dll = new DoublyLinkedList(3);
        dll.append(5);
        dll.append(8);
        dll.append(5);
        dll.append(10);
        dll.append(2);
        dll.append(1);
        dll.partitionList(5);
        System.out.println("Expected Forward: 3 <-> 2 <-> 1 <-> 5 <-> 8 <-> 5 <-> 10");
        System.out.println("Expected Backward: 10 <-> 5 <-> 8 <-> 5 <-> 1 <-> 2 <-> 3");
        printForward(dll);
        printBackward(dll);
        System.out.println();

        // Test 7: Duplicates around pivot
        System.out.println("Test 7: Duplicates Around Pivot");
        dll = new DoublyLinkedList(5);
        dll.append(1);
        dll.append(5);
        dll.append(0);
        dll.append(5);
        dll.partitionList(5);
        System.out.println("Expected Forward: 1 <-> 0 <-> 5 <-> 5 <-> 5");
        System.out.println("Expected Backward: 5 <-> 5 <-> 5 <-> 0 <-> 1");
        printForward(dll);
        printBackward(dll);
        System.out.println();
  }

  // Helper to print forward traversal
  private static void printForward(DoublyLinkedList dll) {
    DoublyLinkedList.Node current = dll.getHead();
    if (current == null) {
      System.out.println("Forward: empty");
      return;
    }
    System.out.print("Forward: ");
    while (current != null) {
      System.out.print(current.value);
      if (current.next != null)
        System.out.print(" <-> ");
      current = current.next;
    }
    System.out.println();
  }

  // Helper to print backward traversal
  private static void printBackward(DoublyLinkedList dll) {
    DoublyLinkedList.Node current = dll.getTail();
    if (current == null) {
      System.out.println("Backward: empty");
      return;
    }
    System.out.print("Backward: ");
    while (current != null) {
      System.out.print(current.value);
      if (current.prev != null)
        System.out.print(" <-> ");
      current = current.prev;
    }
    System.out.println();
  }

}