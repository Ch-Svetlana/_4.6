package org.example;

public class Node {
    private int value;
    private Node prev;

    public Node(int value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
