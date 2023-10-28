// Задание №1
// � Заполнить список десятью случайными числами.
// � Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sort {

  /**
   * @param args
   */
  public static void main(String[] args) {
    List<Integer> num = getRandomList(10);
    System.out.println(num);
    Collections.sort(num);
    System.out.println(num);

  }

  public static ArrayList<Integer> getRandomList(int n) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random rnd = new Random();
    for (int index = 0; index < n; index++) {
      numbers.add(rnd.nextInt(10));
    }
    return numbers;
  }

}