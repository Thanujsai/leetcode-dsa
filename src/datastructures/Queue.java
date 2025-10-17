package datastructures;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.print(temp.value);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }
    
    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }
}
