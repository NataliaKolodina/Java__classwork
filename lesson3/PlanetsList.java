
//📌 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями
//📌 Вывести название каждой планеты и количество его повторений в списке.
//📌 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы

import java.util.ArrayList;
import java.util.Collections;

public class PlanetsList {
  public static void main(String[] args) {
    ArrayList<String> planets = new ArrayList<>();
    // ArrayList<String> str = new ArrayList<>(Arrays.asList("Меркурий", "Венера",
    // "Земля", "Марс",
    // "Юпитер", "Сатурн", "Уран", "Нептун", "Земля", "Меркурий", "Сатурн"));
    planets.add("Нептун");
    planets.add("Меркурий");
    planets.add("Венера");
    planets.add("Земля");
    planets.add("Марс");
    planets.add("Земля");
    planets.add("Венера");
    planets.add("Марс");
    planets.add("Земля");
    planets.add("Юпитер");
    planets.add("Сатурн");
    planets.add("Уран");
    planets.add("Нептун");

    ArrayList<String> sortedP = new ArrayList<>(planets);
    Collections.sort(sortedP);
    System.out.println(sortedP);

    outPlanets(sortedP);
    System.out.println();
    delDoublePlanets(planets);

  }

  public static void outPlanets(ArrayList<String> planets) {
    int count = 1;
    String planet = planets.get(0);
    for (int index = 1; index < planets.size(); index++) {
      if (planets.get(index).equals(planet)) {
        count++;
      } else {
        System.out.println(count + " " + planet);
        planet = planets.get(index);
        count = 1;
      }
    }
    System.out.println(count + " " + planet);
  }

  public static void delDoublePlanets(ArrayList<String> planets) {
    for (int index = 0; index < planets.size(); index++) {
      String planet = planets.get(index);
      for (int j = planets.size() - 1; j >= 0; j--) {
        if (planets.get(j).equals(planet) && j != index) {
          planets.remove(j);
        }
      }
    }
    System.out.println(planets);
  }

}