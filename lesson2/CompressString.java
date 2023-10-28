// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

public class CompressString {
  public static void main(String[] args) {
    String str = "aaaabbbcddd";
    System.out.println(compressString(str));
  }

  public static StringBuilder compressString(String str) {
    int count = 1;
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));
    for (int index = 1; index < str.length(); index++) {
      if (str.charAt(index - 1) == str.charAt(index)) {
        count++;
      } else {
        sb.append(count);
        sb.append(str.charAt(index));
        count = 1;
      }
    }
    sb.append(count);
    return sb;
  }
}