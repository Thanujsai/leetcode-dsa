
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;

public class Main {
  public static void main(String[] args) {
    Stack stack = new Stack(10);

    stack.getTop();
    stack.getHeight();

    stack.printStack();
    System.out.println("---PUSHING---");

    stack.push(20);
    stack.push(30);

    stack.printStack();

    System.out.println("---POPPING---");
    System.out.println(stack.pop().value);
    System.out.println(stack.pop().value);
    System.out.println(stack.pop().value);

    System.out.println("---QUEUE---");

    Queue queue = new Queue(10);

    queue.printQueue();
    queue.getFirst();
    queue.getLast();
    queue.getLength();
  }

}