package datastructures.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //this class is only used to create a node for the linked list
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {//creates a new node
        Node newNode = new Node(value);
        head = newNode;//head is pointing to the new node
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        //creates a new node
        //adds a new node to the end of the list
    }

    public void prepend(int value) {
        //creates a new node
        //adds a new node to the start of the list
    }

    public boolean insert(int index, int value) {
        //creates a new node
        //inserts a new node at the given index
        return true;
    }

}


//all 4 methods create a new node, therefore we need a method for that 