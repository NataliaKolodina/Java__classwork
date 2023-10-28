//Напишите метод, который находит самую длинную строку общего
//префикса среди массива строк. Если общего префикса нет, вернуть пустую строку "".

public class Task4 {
  public static void main(String[] args) {

    String[] str = { "flower", "flow", "flight" };
    // String[] str = {"klower", "ulow", "flight"};
    System.out.println(getCommonPrefix(str));
  }

  static String getCommonPrefix(String[] str) {
    if (str.length == 0)
      return ""; // Проверка на пустой массив
    String pref = str[0];
    for (int i = 1; i < str.length; i++) {
      while (str[i].indexOf(pref) != 0) {
        pref = pref.substring(0, pref.length() - 1);
      }
    }
    return pref;

  }
}
