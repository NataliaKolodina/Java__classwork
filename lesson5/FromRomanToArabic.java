// Написать метод, который переведет число из римского формата записи в
// арабский.
// Например, MMXIX = 2019


import java.util.HashMap;
import java.util.Map;

public class FromRomanToArabic {
public static void main(String[] args) {
Map<Character, Integer> romanValues = getRomanValues();
System.out.println(romanToArabic(romanValues, "MMXXIV"));

}

private static Map<Character, Integer> getRomanValues() {
Map<Character, Integer> romanValues = new HashMap<>();
romanValues.put('I', 1);
romanValues.put('V', 5);
romanValues.put('X', 10);
romanValues.put('L', 50);
romanValues.put('C', 100);
romanValues.put('D', 500);
romanValues.put('M', 1000);
return romanValues;
}

private static int romanToArabic(Map<Character, Integer> getRomanValues, String romanNum) {
int res = 0;
int prevValue = 0;
for (int i = romanNum.length() - 1; i >= 0; i--) {
int currentValue = getRomanValues.get(romanNum.charAt(i));
if (currentValue < prevValue) {
res -= currentValue;
} else {
res += currentValue;
}
prevValue = currentValue;
}
return res;

}
}