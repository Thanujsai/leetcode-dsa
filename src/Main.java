
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

    queue.enqueue(20);
    queue.enqueue(30);

    queue.printQueue();

    System.out.println("---DEQUEUE---");
    queue.dequeue();
    queue.printQueue();

    queue.dequeue();
    queue.printQueue();

    queue.dequeue();
    queue.printQueue();

    queue.dequeue();
    queue.printQueue();

    // Test 1
    System.out.println("Test 1: Empty String");
    System.out.println("Input: ''");
    System.out.println("Expected: true");
    System.out.println("Actual: " + Stack.isBalancedParentheses(""));
    System.out.println();

    // Test 2
    System.out.println("Test 2: Single Pair");
    System.out.println("Input: '()'");
    System.out.println("Expected: true");
    System.out.println("Actual: " + Stack.isBalancedParentheses("()"));
    System.out.println();

    // Test 3
    System.out.println("Test 3: Missing Open");
    System.out.println("Input: ')'");
    System.out.println("Expected: false");
    System.out.println("Actual: " + Stack.isBalancedParentheses(")"));
    System.out.println();

    // Test 4
    System.out.println("Test 4: Missing Close");
    System.out.println("Input: '('");
    System.out.println("Expected: false");
    System.out.println("Actual: " + Stack.isBalancedParentheses("("));
    System.out.println();

    // Test 5
    System.out.println("Test 5: Multiple Pairs");
    System.out.println("Input: '()()'");
    System.out.println("Expected: true");
    System.out.println("Actual: " + Stack.isBalancedParentheses("()()"));
    System.out.println();
  }

}