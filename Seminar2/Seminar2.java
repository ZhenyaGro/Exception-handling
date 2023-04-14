package Seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seminar2 {

  /*
   * 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа
   * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
   * должно приводить к падению приложения, вместо этого, необходимо повторно
   * запросить у пользователя ввод данных.
   */
  public static void askFloat() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите дробное число: ");
    float number;

    try {
      number = scan.nextFloat();
    } catch (InputMismatchException ime) {
      System.out.println("Некорректный ввод");
      askFloat();
      return;
    }

    System.out.println("Введенное число: " + number);
  }

  /*
   * 2) Если необходимо, исправьте данный код (задание 2
   * https://docs.google.com/document/d/
   * 17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
   */
  public static void task2() {
    int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    try {
      int d = 0;
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }

  }
}
