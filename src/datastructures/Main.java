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
  }
}