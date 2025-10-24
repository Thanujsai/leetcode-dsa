package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);//this returns a copy of the heap list because we dont want to expose the internal representation
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2){//swapping values in array list
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);//add value to the end of the list
        int current = heap.size() - 1;//index of the newly added value
        while (current > 0 && heap.get(parent(current)) < heap.get(current)) { //while the current node is greater than its parent
            swap(parent(current), current);
            current = parent(current);//move up to the parent's index
        }
    }
}
