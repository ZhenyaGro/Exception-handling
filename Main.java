import Seminar3.Seminar3;

public class Main {
  public static void main(String[] args) {
    String[][] testArr = {
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" }
    };

    int result = Seminar3.checkArray(testArr, 4, 4);
    System.out.println(result);
  }
}
