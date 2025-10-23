package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();//creation of a graph {}

    public void printGraph() {
        System.out.println(adjList);
    }
    public boolean addVertex(String vertex) {
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());//adding the vertex with an empty arraylist
            return true;
        }
        return false;
    }
}
