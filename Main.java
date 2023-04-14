import java.io.FileInputStream;
import java.io.InputStream;

import Seminar1.Seminar1;
import Seminar2.Seminar2;

public class Main {
  public static void main(String[] args) { // Убран проброс исключения из основного метода

    // Seminar 1
    /*
     * Integer[] arr = { 1, 2, null, 3, null, 4 };
     * Seminar1.CheckArr(arr);
     * 
     * int[] arr1 = { 1, 2, 3, 4 };
     * int[] arr2 = { 2, 3, 4 };
     * int[] result = Seminar1.CombineArrs(arr1, arr2);
     * 
     * for (int i : result) {
     * System.out.print(i + " ");
     * }
     */

    // Seminar 2, task 1
    Seminar2.askFloat();

    Seminar2.task2();

    // Seminar 2, Task 3
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      Seminar2.printSum(23, 234);
      int[] abc = { 1, 2 };
      abc[3] = 9;
    } catch (NullPointerException ex) { // Изменен порядок catch'ей
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }

    // Seminar 2, task 4
    InputStream inputStream;
    try {
      String[] strings = { "apple", "orange" };
      String strings1 = strings[2];
      Seminar2.test();
      int a = 1 / 0;
      inputStream = new FileInputStream("/broken_reference");
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("На ноль делить нельзя");
    } catch (StackOverflowError error) {
      System.out.println("Что-то сломалось");
    } catch (Throwable e) {
      e.printStackTrace();
    } finally {
      System.out.println("Я все равно выполнился");
    }
    System.out.println("Я жив!");
  }
}