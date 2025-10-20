package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

//Hashtable is an array of Node pointers
//each node itself stores key, value and pointer to next node (for handling collisions using chaining)
public class HashTable {
    private int size = 7;
    private Node[] dataMap;//array that contains pointers to nodes

    public HashTable() {
        dataMap = new Node[size];
    }

    public class Node {
        String key;//node stores both key and value
        int value;
        Node next;//for handling collisions using chaining

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

    private int hash(String key) {//this function generates an index based on the key, then we use that index to store the value in the dataMap array
        int hash = 0;
        char[] keyChars = key.toCharArray();//this is not the length of the array, but the characters in the string of the key, like if key is "paint", keyChars will be ['p','a','i','n','t'], size is 5
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
            if(temp.key.equals(key)) return temp.value;
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
    //getting and setting values in hashtables is on average O(1) time complexity

    //comparing 2 arrays generally take O(n^2) time complexity, since we have to loop through each array and compare each element
    //but using hashtables we can reduce it to O(n) time complexity
    
    //this is because we can store the elements of one array in the hashtable in O(n) time, then we can loop through the second array and check if each element exists in the hashtable in O(1) time on average
    //itemInCommon in main class
}
