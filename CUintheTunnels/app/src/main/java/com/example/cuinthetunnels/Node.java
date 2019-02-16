package com.example.cuinthetunnels;

import java.util.List;

public class Node {
    public String name;
    public List<Edge> connections;

    public void addEdge(Edge e){
        connections.add(e);
    }
}
