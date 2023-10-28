// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.FileWriter;

public class RepeatTest {

  public static void main(String[] args) {
    // System.out.println(hundreadWords("TEST", 100));
    String str = hundreadWords("TEST", 100);
    writeToFile(str, ".");

  }

  public static String hundreadWords(String word, int count) {

    StringBuilder str = new StringBuilder();

    for (int i = 0; i < count; i++) {
      str.append(word + " ");
    }
    return str.toString();
  }

  public static void writeToFile(String str, String nameFile) {
    try (FileWriter fileWriter = new FileWriter(nameFile)) {

      fileWriter.write(str);
    } catch (Exception e) {
      System.out.println(" Ошибка ");

    }

  }

}