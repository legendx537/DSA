package com.legend.linkedlist;

import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
       SinglyLinkedList sLL = new SinglyLinkedList();
       sLL.createSinglyLinkedList(5);
       System.out.println(sLL.head.data);
    }
}
