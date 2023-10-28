// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class Revert {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      LinkedList<String> strListMamory = new LinkedList<>();

      while (true) {
        System.out.println("Введите строку или print/revert для операций или exit для выхода: ");
        String strText = scanner.nextLine();
        if (strText.equals("exit")) {
          break;
        }
        if (strText.equals("print")) {
          printMemory(strListMamory);

        } else if (strText.equals("revert")) {
          revertMemory(strListMamory);

        } else {
          strListMamory.add(strText);
          System.out.println(strListMamory);

        }
      }
    }

  }

  private static void printMemory(LinkedList<String> strListMamory) {
    for (int index = strListMamory.size() - 1; index >= 0; index--) {
      System.out.println(strListMamory.get(index));

    }
  }

  private static void revertMemory(LinkedList<String> strListMamory) {
    if (!strListMamory.isEmpty()) {
      strListMamory.removeLast();
      System.out.println(strListMamory);
    }
  }

}