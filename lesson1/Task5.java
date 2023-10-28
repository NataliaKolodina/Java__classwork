// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

public class Task5 {
  public static void main(String[] args) {
    String input = "Добро пожаловать на курс по Java";
    System.out.println(reverseWords(input));
  }

  public static String reverseWords(String text) {
    String[] wordArr = text.split(" ");
    String reversedString = "";

    for (int i = wordArr.length - 1; i >= 0; i--) {
      reversedString += wordArr[i] + " ";
    }

    return reversedString;
  }
}
