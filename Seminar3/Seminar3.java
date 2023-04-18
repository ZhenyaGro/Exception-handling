package Seminar3;

public class Seminar3 {
  /*
   * 1. Напишите метод, на вход которого подаётся двумерный строковый массив
   * размером 4х4,
   * при подаче массива другого размера необходимо бросить исключение
   * MyArraySizeException.
   * 
   * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в
   * int, и просуммировать. Если в каком-то элементе массива преобразование не
   * удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
   * брошено исключение MyArrayDataException, с детализацией в какой именно ячейке
   * лежат неверные данные.
   * 
   * 3. В методе main() вызвать полученный метод, обработать возможные исключения
   * MyArraySizeException и MyArrayDataException и вывести результат расчета
   * (сумму элементов, при условии что подали на вход корректный массив).
   */
  public static int checkArray(String[][] array, int rowLength, int colLength) {
    if (array.length != colLength)
      throw new MyArraySizeException();

    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i].length != colLength)
        throw new MyArraySizeException();

      for (int j = 0; j < array[i].length; j++) {
        try {
          sum += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(i, j);
        }
      }
    }

    return sum;
  }
}
