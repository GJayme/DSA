package datastructures.recursion;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);

    System.out.println(Recursion.sumIntegerArray(arrayList));
    System.out.printf("\n");
    System.out.println(arrayList);
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    arrayList2.add(1);
    System.out.println(Recursion.sizeArray(arrayList2));




  }
}
