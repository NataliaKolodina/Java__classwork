// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SequenceBrackets {
  public static void main(String[] args) {
    String[] examples = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
    HashMap<Character, Character> breakets = getBreakets();

    for (String example : examples) {
      boolean result = checkBreakets(breakets, example);
      System.out.println(example + "-> " + result);

    }
  }

  public static HashMap<Character, Character> getBreakets() {
    HashMap<Character, Character> breakets = new HashMap<>();
    breakets.put(')', '(');
    breakets.put(']', '[');
    breakets.put('}', '{');
    breakets.put('>', '<');
    return breakets;

  }

  public static boolean checkBreakets(HashMap<Character, Character> breakets, String example) {
    Stack<Character> stack = new Stack<>();
    for (char ch : example.toCharArray()) {
      if (breakets.containsValue(ch)) { // Если встретилась открывающая скобка-
        stack.push(ch); // добавим в стэк
      } else if (breakets.containsKey(ch)) { // если встретилась закрывающая скобка -
        if (stack.isEmpty() || breakets.get(ch) != stack.pop()) { // проверяем пустой ли стэк или
          return false;
        }
      }

    }
    return stack.isEmpty();

  }
}