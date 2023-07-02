package circularlinkedlist;

public class Main {
    public static void main(String[] args) {
      CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
      csll.createCSLL(5);
      csll.insertCSLL(6,0);
      csll.insertCSLL(7,2);
      csll.insertCSLL(8,3);
      csll.insertCSLL(9,4);
      System.out.println(csll.head.value);


    }
}
