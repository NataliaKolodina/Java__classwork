// 📌 Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// 📌 Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;

public class PasspotName {
  public static void main(String[] args) {
    HashMap<Integer, String> data = new HashMap<>();
    data.put(123456, "Иванов");
    data.put(321456, "Васильев");
    data.put(234561, "Петрова");
    data.put(234432, "Иванов");
    data.put(654321, "Петрова");
    data.put(345678, "Иванов");

    for (Integer passpotNum : data.keySet()) {
      String name = data.get(passpotNum);
      if (name.equals("Иванов")) {
        System.out.println("Номер паспорта: " + passpotNum + ", Фамилия: " + name);
      }
    }

  }
}