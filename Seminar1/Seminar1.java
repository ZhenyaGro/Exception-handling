package Seminar1;

import java.util.ArrayList;

public class Seminar1 {

  /*
   * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве
   * аргумента целочисленный одномерный массив. Метод должен пройтись по каждому
   * элементу и проверить что он не равен null.
   * А теперь реализуйте следующую логику:
   * Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
   * пользователя
   * Если null’ы встретились в нескольких ячейках, то идеально было бы все их
   * “подсветить”
   */
  public static void CheckArr(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == null) {
        System.out.println(String.format("Элемент с индексом %s равен null", i));
      }
    }
  }

  /*
   * Реализуйте метод, принимающий в качестве аргументов два целочисленных
   * массива, и возвращающий новый массив, каждый элемент которого равен сумме
   * элементов двух входящих массивов в той же ячейке. Если длины массивов не
   * равны, необходимо как-то оповестить пользователя.
   */
  public static int[] CombineArrs(int[] arr1, int[] arr2) {
    int[] result;

    if (arr1.length != arr2.length) {
      System.out.println("Длины массивов не равны");
      result = new int[arr1.length > arr2.length ? arr2.length : arr1.length];
    } else
      result = new int[arr1.length];

    for (int i = 0; i < result.length; i++) {
      result[i] = arr1[i] + arr2[i];
    }

    return result;
  }

}
