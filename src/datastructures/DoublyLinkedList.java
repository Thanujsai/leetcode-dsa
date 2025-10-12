package datastructures;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        public int value;
        public Node next;//next pointer
        public Node prev;//previous pointer

        //double linked list has both next and previous pointers

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
        
    }

    public Node removeLast() {
        if(length == 0) return null;

        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;

        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    } 

    public Node removeFirst() {
        if(length == 0) return null;

        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            temp.next = null;
            head.prev = null;
        }

        length--;
        return temp;
    }

    
    public Node get(int index){
        //gets the node at the given index
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index < length/2){
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        //sets the value of the node at the given index
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        //inserts a new node at the start of the list
        if(index == 0){
            prepend(value);
            return true;
        }

        //inserts a new node at the end of the list
        if(index == length){
            append(value);
            return true;
        }

        //inserts a new node at the given index
        Node newNode = new Node(value);
        Node tempBefore = get(index - 1);
        Node tempAfter = tempBefore.next;
        newNode.prev = tempBefore;
        newNode.next = tempAfter;
        tempBefore.next = newNode;
        tempAfter.prev = newNode;
        length++;

        return true;
    }

    public Node remove(int index){
        if(index<0 || index>=length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public boolean isPalindrome(){
        if(length == 1) return true;
        
        Node tempHead = head;
        Node tempTail = tail;
        for(int i =0;i< length/2;i++){
            if(tempHead.value == tempTail.value){
                tempHead = tempHead.next;
                tempTail = tempTail.prev;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public void reverse(){
        if(length == 0 || length == 1) return;
        
        Node current = head;
        Node temp = null;

        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;  // move to next node (which is prev after swapping)
        }

        temp = head;
        head = tail;
        tail = temp;

        
    }

    public void partitionList(int x) {
        if (head == null) return;
    
        // Dummy nodes for two partitions
        Node lessDummy = new Node(0);
        Node greaterDummy = new Node(0);
    
        Node lessTail = lessDummy;
        Node greaterTail = greaterDummy;
        Node current = head;
    
        // Traverse the list
        while (current != null) {
            Node nextNode = current.next; // store next node
            current.prev = current.next = null; // detach current node
    
            if (current.value < x) {
                // Append to the 'less than x' list
                lessTail.next = current;
                current.prev = lessTail;
                lessTail = current;
            } else {
                // Append to the 'greater than or equal to x' list
                greaterTail.next = current;
                current.prev = greaterTail;
                greaterTail = current;
            }
    
            current = nextNode;
        }
    
        // Join the two lists
        if (lessDummy.next != null) {
            head = lessDummy.next;
            lessTail.next = greaterDummy.next;
            if (greaterDummy.next != null) {
                greaterDummy.next.prev = lessTail;
            }
        } else {
            // If there are no nodes less than x
            head = greaterDummy.next;
        }
    
        // Ensure head.prev is null
        if (head != null) {
            head.prev = null;
        }
    }


}
