package com.kruskal;

public class Node {
    private int degree;
    private int index;
    private Node parent;

    public Node(int d, int i, Node p) {
        degree = d;
        index = i;
        parent = p;
    }

    public int getDegree() {
        return degree;
    }

    public int getIndex() {
        return index;
    }

    public Node getParent() {
        return parent;
    }

    public void setDegree() {
        degree++;
    }

    public void setParent(Node p) {
        parent = p;
    }


}
