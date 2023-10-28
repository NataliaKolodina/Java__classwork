// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

public class CharacterPair {
  public static void main(String[] args) {
    char c1 = 'a';
    char c2 = 'b';
    int count = 100000;

    long start = System.currentTimeMillis();
    System.out.println(characterPairSb(count, c1, c2));
    System.out.println(System.currentTimeMillis() - start);

    start = System.currentTimeMillis();
    System.out.println(characterPairStr(count, c1, c2));
    System.out.println(System.currentTimeMillis() - start);
}

public static String characterPairSb(int count, char char1, char char2) {
    StringBuilder sb = new StringBuilder(count);

    for (int i = 0; i < count / 2; i++) {
        sb.append(char1).append(char2);
    }

    return sb.toString();
}

public static String characterPairStr(int count, char char1, char char2) {
    String str = "";

    for (int i = 0; i < count / 2; i++) {
        str += Character.toString(char1) + Character.toString(char2);
    }

    return str;
}
}