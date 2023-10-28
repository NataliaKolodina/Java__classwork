// Написать метод, который переведёт данное целое число в римский формат.

import java.util.HashMap;
import java.util.Map;

public class FromArabicToRoman {
  public static void main(String[] args) {

  }

  private static Map<Integer, String> getRomanValues() {
    Map<Integer, String> romanValues = new HashMap<>();
    romanValues.put(1000, "M");
    romanValues.put(900, "CM");
    romanValues.put(500, "D");
    romanValues.put(400, "CD");
    romanValues.put(100, "C");
    romanValues.put(90, "XC");
    romanValues.put(50, "L");
    romanValues.put(40, "XL");
    romanValues.put(10, "X");
    romanValues.put(9, "IX");
    romanValues.put(5, "V");
    romanValues.put(4, "IV");
    romanValues.put(1, "I");
    return romanValues;
  }

}