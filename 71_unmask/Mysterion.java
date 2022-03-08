/*
Pumpkin (Jefford Shau, Anthony Sun, Jonathan Song)
APCS
HW71 -- Whut Dis
2022-03-07
time spent: 0.5 hr + class time
*/

public class Mysterion {

  public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void mysterion(int[] arr, int a, int b, int c) {
    int v = arr[c];
    swap(arr, c, b);
    int s = a;
    for(int i = a; i < b; i++) {
      if(arr[i] < v) {
        swap(arr, s, i);
        s += 1;
      }
    }
    swap(arr, b, s);
  }

  public static String toString(int[] arr) {
    String result = "{";
    for (int i : arr) {
      result += i + ", ";
    }
    result = result.substring(0, result.length() - 2);
    result += "}";
    return result;
  }

  public static void main(String[] args) {
    int[] test1 = {7, 1, 5, 12, 3};
    System.out.print(toString(test1) + " to: ");
    mysterion(test1, 0, 4, 2);
    System.out.println(toString(test1));

    int[] test2 = {7, 5, 12, 1, 3};
    System.out.print(toString(test2) + " to: ");
    mysterion(test2, 0, 4, 2);
    System.out.println(toString(test2));

    int[] test3 = {3, 12, 7, 1, 5};
    System.out.print(toString(test3) + " to: ");
    mysterion(test3, 0, 4, 2);
    System.out.println(toString(test3));

    int[] test4 = {1, 3, 5, 12, 7};
    System.out.print(toString(test4) + " to: ");
    mysterion(test4, 0, 4, 2);
    System.out.println(toString(test4));
  }
}
