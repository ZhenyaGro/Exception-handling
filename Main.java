import Seminar3.MyArrayDataException;
import Seminar3.MyArraySizeException;
import Seminar3.Seminar3;

public class Main {
  public static void main(String[] args) {
    String[][] testArr = {
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" }
    };

    int result = 0;
    try {
      result = Seminar3.checkArray(testArr, 4, 4);
    } catch (MyArraySizeException | MyArrayDataException e) {
      e.printStackTrace();
      return;
    }

    System.out.println("Сумма: " + result);
  }
}
