// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StekArray {
  public static void main(String[] args) {
    String[] str = { "Саша", "Маша", "Даша", "Петя", "Федя", "Ваня", "Катя", "Валя" };
    fillPrintStack(str);
    fillPrintQueue(str);
  }

  private static void fillPrintQueue(String[] str) {
    Queue<String> quName = new LinkedList<>();
    for (String name : str) {
      quName.add(name);
    }
    System.out.println(quName);
  }

  private static void fillPrintStack(String[] str) {
    Stack<String> stackName = new Stack<>();
    for (String name : str) {
      stackName.push(name);
    }
    System.out.println(stackName);
  }

}