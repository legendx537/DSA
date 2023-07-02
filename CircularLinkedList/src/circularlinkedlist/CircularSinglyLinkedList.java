package circularlinkedlist;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL(int nodeValue,int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
          tail.next = node;
          tail = node;
          tail.next = head;
        } else {
            Node tempNode = head;
            for(int i=0; i<location-1; i++)  {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }


    public void traversalOFCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("The CSLL does not exist");
        }
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at the Position -> " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not Found");
        return false;
    }

    public void deletionOfANode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail = head;
            size--;
            if (size == 0) {
                head.next = null;
                head = tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i=0; i<size-1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else  {
            Node tempNode = head;
            for (int i=0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteWholeCSLL() {
        if (head == null) {
            System.out.println("The CSLL Does not exist");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL is deleted successfully");
        }
    }

}
