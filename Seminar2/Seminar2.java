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
}
