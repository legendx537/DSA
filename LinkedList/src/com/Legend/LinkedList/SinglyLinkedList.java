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
        size++;
    }

    public void traversalSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                System.out.print(tempNode.data);
                if (i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public boolean searchSinglyLinkedList(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.data == nodeValue) {
                    System.out.println("The value found at position -> " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Value Not found in the Linked List");
        return false;
    }
}
