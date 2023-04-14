package datastructures.recursion;

import java.util.ArrayList;

final class Recursion {
  public static int sumIntegerArray(ArrayList<Integer> integerArray) {
    if (integerArray.size() == 1) {
      return integerArray.stream().findFirst().get();
    }
    int firstElement = integerArray.remove(0);
    return firstElement + sumIntegerArray(integerArray);
  }

  public static int sizeArray(ArrayList<Integer> arrayList) {
    if (arrayList.isEmpty()) {
      return 0;
    }
    arrayList.remove(0);
    return 1 + sizeArray(arrayList);
  }

  private Recursion() {}
}
