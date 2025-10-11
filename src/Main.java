
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
  }
}