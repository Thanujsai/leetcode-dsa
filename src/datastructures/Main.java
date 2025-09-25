package datastructures;
import datastructures.LinkedList.LinkedList;

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
    myLinkedList.printList();
  }
}