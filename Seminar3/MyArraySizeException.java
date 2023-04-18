package Seminar3;

public class MyArraySizeException extends RuntimeException {
  public MyArraySizeException() {
    System.out.println("Размер массива некорректен");
  }
}
