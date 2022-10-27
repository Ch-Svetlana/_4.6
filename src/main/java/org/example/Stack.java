package org.example;

public class Stack {

    private Node head;


    public Node getHead() {
        return head;
    }


    public void setHead(Node head) {
        this.head = head;
    }


    public void push(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node node = new Node(value, head);
            head = node;
        }
    }

    public String pop() {
        if (head == null) {
            return "нет элементов!";
        } else {
            String value = Integer.toString(head.getValue());
            head = head.getPrev();
            return value;
        }
    }

    public boolean printme() {
        if (head == null) {
            System.out.println("EMPTY");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.getValue());
                if (node.getPrev() != null) {
                    System.out.print(" -> ");
                }
                node = node.getPrev();
            }
            System.out.println();
        }
        return true;
    }
}