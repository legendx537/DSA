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

    public void insertInALinkedList(int nodeValue,int location) {
        Node node = new Node();
        node.data = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            int index = 0;
            Node tempNode = head;
            while (index < location - 1) {
              tempNode = tempNode.next;
              index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
    }
}
