package datastructures.linkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(2);
    myLinkedList.prepend(3);

    myLinkedList.printList();

    myLinkedList.makeEmpty();

    System.out.printf("Empty");
    myLinkedList.printList();

    myLinkedList.prepend(1);

    myLinkedList.printList();

  }
}