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

    public boolean addEdge(String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {//both vertices exist
            adjList.get(vertex1).add(vertex2);//adding an edge from vertex1 to vertex2, since this is an undirected graph, we also need to add an edge from vertex2 to vertex1
            adjList.get(vertex2).add(vertex1);

            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {//both vertices exist
            adjList.get(vertex1).remove(vertex2);//removing the edge from vertex1 to vertex2, since this is an undirected graph, we also need to remove the edge from vertex2 to vertex1
            adjList.get(vertex2).remove(vertex1);

            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if(adjList.get(vertex) != null) {
            ArrayList<String> connectedVertices = adjList.get(vertex);
            for(int i=0; i<connectedVertices.size(); i++) {
                String adjacentVertex = connectedVertices.get(i);
                adjList.get(adjacentVertex).remove(vertex);//removing the edge from the adjacent vertex to the vertex being removed
            }
            adjList.remove(vertex);//removing the vertex itself
            return true;
        }
        return false;
    }
}

/*
 * this is how a graph looks like:
 * {
 *   A: [B, C],
 *   B: [A, D],
 *   C: [A],
 *   D: [B]
 * }
 * like a hashmap where each key is a vertex and the value is an arraylist of vertices that are connected to that vertex
 * 
 * so to add an edge, say between C & D, we need to add D to the arraylist of C and C to the arraylist of D
 * 
 * so it becomes like below
 * {
 *   A: [B, C],
 *  B: [A, D],
 *  C: [A, D],
 * D: [B, C]
 * }
 */