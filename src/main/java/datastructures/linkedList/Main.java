package datastructures.linkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(0);
    myLinkedList.append(1);
    myLinkedList.append(2);
    myLinkedList.append(3);

    myLinkedList.printList();

    myLinkedList.set(2, 10);

    System.out.println("\n");
    myLinkedList.printList();
  }
}