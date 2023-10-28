// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

// 1 вариант

public class Palindrome {
  public static void main(String[] args) {
    String str = "faabbubaaf";

    System.out.println(isPalindrome(str));
  }

  public static boolean isPalindrome(String str) {
    for (int index = 0; index < str.length() / 2; index++) {
      if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
        return false;

      }
    }
    return true;
  }

}

// // 2 вариант
// public class Palindrome {
// public static void isPalindrome(String str) {
// System.out.println(str);
// StringBuilder build = new StringBuilder(str);
// build.reverse();
// System.out.println(build.toString().equals(str));
// }
