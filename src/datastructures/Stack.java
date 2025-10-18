package datastructures;

public class Stack {
    private Node top;
    private int height;

    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public Stack() {
        top = null;
        height = 0;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

        
    public boolean isEmpty() {
        return height == 0;
    }

    public static boolean isBalancedParentheses(String parentheses) {
        Stack stack = new Stack();
        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop().value != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}