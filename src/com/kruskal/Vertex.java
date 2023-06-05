package com.kruskal;

public class Vertex {
    private int x;
    private int y;
    private Node node;

    public Vertex(int xi, int yi){
        x = xi;
        y = yi;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Node getNo(){
        return node;
    }

    public void setNo(Node n){
        node = n;
    }
}
