// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class TextNum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();
    // System.out.println("Введите набор символов типа текст~число: ");
    while (true) {
      System.out.println("Введите набор символов типа текст~число: ");
      String str = scanner.nextLine();
      if (str.equals("exit")) {
        break;
      }
      String[] strSplit = str.split("~");
      String text = strSplit[0];
      int index = Integer.parseInt(strSplit[1]);
      if (!strSplit[0].equals("print")) {
        if (index <= linkedList.size()) {
          linkedList.add(index, text);
        }
        System.out.println(linkedList);
      } else {
        System.out.println(linkedList.get(index));
        linkedList.remove(index);
        System.out.println(linkedList);
      }

    }
  }
}