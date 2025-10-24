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

    public Integer remove() {
        if(heap.size() == 0){
            return null; //heap is empty
        }

        if(heap.size() == 1){
            return heap.remove(0); //only one element in the heap
        }

        int maxValue = heap.get(0); //the root of the heap
        heap.set(0, heap.remove(heap.size() - 1)); //replace root with the last element
        sinkDown(0); //restore heap property
        return maxValue;
    }

    public void sinkDown(int index) {
        int maxIndex = index;
        while(true){
            int leftIndex = leftChild(maxIndex);
            int rightIndex = rightChild(maxIndex);

            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)){
                maxIndex = leftIndex;
            }

            if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)){
                maxIndex = rightIndex;
            }

            if(maxIndex != index){
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return; //heap property is restored
            }
        }
    }
}
