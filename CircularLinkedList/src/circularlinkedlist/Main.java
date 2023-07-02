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

      csll.traversalOFCSLL();

      csll.searchNode(7);

      csll.traversalOFCSLL();
      csll.deletionOfANode(0);
      csll.traversalOFCSLL();

      csll.traversalOFCSLL();
      csll.deleteWholeCSLL();
      csll.traversalOFCSLL();

    }
}
