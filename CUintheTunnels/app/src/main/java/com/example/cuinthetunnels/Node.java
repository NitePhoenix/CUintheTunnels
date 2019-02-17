package com.example.cuinthetunnels;

import java.util.List;

public class Node {
    public String name;
    private List<Edge> connections = null;

    public Node(String name){
        this.name = name;
    }

    public void addEdge(Edge e){
        connections.add(e);
    }
}
