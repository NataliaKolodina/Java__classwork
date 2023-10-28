// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in, "ibm866");
    System.out.print("Введите имя пользователя: ");
    String name = scan.nextLine();
    System.out.printf("Привет, %s!", name);
    scan.close();
  }
}
