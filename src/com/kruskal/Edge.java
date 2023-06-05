package com.kruskal;

public class Edge implements Comparable<Edge>{
    private Vertex a, b;
    private int weight;

    public Edge(Vertex ai, Vertex bi, int w){
        a = ai;
        b = bi;
        weight = w;
    }

    public Vertex getA() {
        return a;
    }

    public Vertex getB() {
        return b;
    }

    public int getWeight() {
        return weight;
    }

    public int compareTo(Edge edge) {
        if (weight < edge.getWeight())
            return -1;
        else if (weight > edge.getWeight())
            return 1;
        else
            return 0;
    }
}
