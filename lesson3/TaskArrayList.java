// Задание №2
// � Создать список типа ArrayList<String>.
// � Поместить в него как строки, так и целые числа.
// � Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Iterator;

public class TaskArrayList {

  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>();
    numbers.add("Ирина");
    numbers.add("5");
    numbers.add("10");
    numbers.add("Пятница");
    numbers.add("5");
    numbers.add("11");
    numbers.add("Привет");
    numbers.add("20");
    numbers.add("Слово");

    System.out.println(numbers);

    delNumbers(numbers);
    System.out.println(numbers);

  }

  public static void delNumbers(ArrayList<String> delNum) {
    Iterator<String> iterator = delNum.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      if (isNumeric(element)) {
        iterator.remove();
      }
    }

  }

  public static boolean isNumeric(String str) {
    try {
      Integer.parseInt(str);
      return true;

    } catch (Exception e) {
      return false;
    }

  }

}