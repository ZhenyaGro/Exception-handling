package Seminar3;

public class MyArrayDataException extends RuntimeException {
  public MyArrayDataException(int col, int row) {
    super("Не удалось выполнить преобразование к числу в ячейке (" + col + ", " + row + ")");
  }
}
