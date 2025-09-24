package datastructures.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //this class is only used to create a node for the linked list
    public class Node {
        public int value;
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
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
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
        Node newNode = new Node(value);

        //adds a new node to the end of the list
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        
    }

    public Node removeLast() {
        //removes the last node of the list
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;

        length--;
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
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