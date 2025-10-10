package datastructures;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

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

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
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
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            //adds a new node to the start of the list
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public Node removeFirst() {
        //removes the first node of the list
        if(length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }

        return temp;//pointer to the node we have removed
    }

    public Node get(int index){
        //gets the node at the given index
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
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
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;

        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        //removes the first node of the list
        if(index == 0) return removeFirst();

        //removes the last node of the list
        if(index == length - 1) return removeLast();

        //removes the node at the given index
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
	    Node slow = head;
	    Node fast = head;
 
	    while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
	    }
 
	    return slow;
	}

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }

    public Node findKthFromEnd(int k) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Finds the k-th node from the end of a singly    |
        //   |   linked list.                                    |
        //   | - Returns the node at that position or null if    |
        //   |   `k` is invalid or exceeds the list length.      |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two pointers, `fast` and `slow`, starting  |
        //   |   at the head of the list.                        |
        //   | - Moves `fast` forward `k` nodes ahead of `slow`. |
        //   | - Then moves both pointers together until `fast`  |
        //   |   reaches the end.                                |
        //   | - At that point, `slow` points to the k-th node   |
        //   |   from the end and is returned.                   |
        //   +===================================================+
        
        if(k<=0){
            return null;
        }
        
        Node fast = head;
        Node slow = head;
        
        for(int i=0;i<k;i++){
            if (fast == null) return null; // k > length safeguard

            fast = fast.next;
        }
        
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }

    public void removeDuplicates() {
        Node current = head;
        
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(runner.next.value == current.value){
                    runner.next = runner.next.next;
                    length--;
                }
                else{
                    runner = runner.next;
                }
            }
            current=current.next;

            
        }
        
    }

    public int binaryToDecimal() {
        int num = 0;
        Node current = head;
        while(current != null){
            num = num * 2 + current.value;
            current = current.next;
        }
        
        return num;
    }

    public void partitionList(int x) {
        if (head == null) return;
    
        Node lessHead = new Node(0);     // dummy head for < x
        Node greaterHead = new Node(0);  // dummy head for >= x
        Node less = lessHead;
        Node greater = greaterHead;
    
        Node temp = head;
        while (temp != null) {
            if (temp.value < x) {
                less.next = temp;
                less = less.next;
            } else {
                greater.next = temp;
                greater = greater.next;
            }
            temp = temp.next;
        }
    
        // Important: terminate the greater list
        greater.next = null;
    
        // Connect the two lists
        less.next = greaterHead.next;
    
        // Update head
        head = lessHead.next;
    }


}


//all 4 methods create a new node, therefore we need a method for that 