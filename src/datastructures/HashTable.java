package datastructures;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;//array that contains pointers to nodes

    public HashTable() {
        dataMap = new Node[size];
    }

    public class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("  {" + temp.key + ": " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i=0; i<keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;//using a prime number 23 so that the output is more unique, modulo length of dataMap because we want it to fit in the array
        }
        return hash;//this will always be the number between 0 and length-1
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next != null) {//takes us to the last node in the chain
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null) {
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;//indicates not found
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i=0; i<dataMap.length; i++) {
            Node temp = dataMap[i];
            while(temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
