package datastructures.linkedList;

/**
 * LinkedList a data structure consisting of a collection of nodes which together represent a sequence.
 */
public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  public class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void append(int value) {
    var newNode = new Node(value);
    if (tail != null) {
      tail.next = newNode;
    } else {
      head = newNode;
    }
    tail = newNode;
    length++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public void makeEmpty() {
    head = null;
    tail = null;
    length = 0;
  }

  public Node removeLast() {
    if (head == null) return null;
    Node temp = head;
    Node pre = head;
    while (temp.next != null) {
      pre = temp;
      temp = temp.next;
    }
    tail = pre;
    tail.next = null;
    length--;
    if (length == 0) {
      head = null;
      tail = null;
    }
    return temp;
  }

  public Node removeFirst() {
    if (length == 0) return null;
    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if (length == 0) {
      tail = null;
    }
    return temp;
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    if (temp != null) {
      temp.value = value;
      return false;
    }
    return false;
  }

  public boolean insert (int index, int value) {
    if (index < 0 || index > length) return false;

    if (index == 0) {
      prepend(value);
      return true;
    }

    if (index == length) {
      append(value);
      return true;
    }

    Node newNode = new Node(value);
    Node temp = get(index - 1);
    newNode.next = temp.next;
    temp.next = newNode;
    length++;
    return true;
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    if (temp != null) {
      temp.value = value;
      return false;
    }
    return false;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) {
      return null;
    }
    Node temp = head;
    for (int i = 0; i < index; i++) {
       temp = temp.next;
    }
    return temp;
  }

  public void getHead() {
    if (head == null) {
      System.out.println("Head: null");
    } else {
      System.out.println("Head: " + head.value);
    }
  }

  public void getTail() {
    if (head == null) {
      System.out.println("Tail: null");
    } else {
      System.out.println("Tail: " + tail.value);
    }
  }

  public void getLength() {
    System.out.println("Length: " + length);
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }
}
