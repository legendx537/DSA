package com.legend.linkedlist;

public class Main {
    public static void main(String[] args) {
       SinglyLinkedList sLL = new SinglyLinkedList();
       sLL.createSinglyLinkedList(5);
       System.out.println(sLL.head.data);
       sLL.insertInALinkedList(7,1);
       sLL.insertInALinkedList(8,3);
       sLL.insertInALinkedList(9,4);
       sLL.insertInALinkedList(10,5);
       sLL.insertInALinkedList(11,6);

       sLL.traversalSinglyLinkedList();
       sLL.searchSinglyLinkedList(9);

       sLL.traversalSinglyLinkedList();
       sLL.deletionOfNode(3);
       sLL.traversalSinglyLinkedList();
    }
}
