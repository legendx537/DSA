package com.legend.linkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.data = nodeValue;
        node.next = null;
        head = tail = node;
        return head;
    }
}
