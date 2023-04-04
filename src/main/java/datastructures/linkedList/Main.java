package datastructures.linkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(0);
    myLinkedList.append(1);

    myLinkedList.printList();

    myLinkedList.insert(1, 10);

    System.out.println("\n");
    myLinkedList.printList();
  }
}