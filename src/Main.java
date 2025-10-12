
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

    myDoublyLinkedList2.insert(2,3);

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
  }
}