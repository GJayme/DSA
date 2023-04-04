package datastructures.linkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(11);
    myLinkedList.append(3);
    myLinkedList.append(4);
    myLinkedList.append(7);

    myLinkedList.printList();

    myLinkedList.remove(2);

    System.out.println("\n");
    myLinkedList.printList();
  }
}