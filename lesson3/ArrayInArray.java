// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.List;

public class ArrayInArray {
  public static void main(String[] args) {
    List<ArrayList<String>> catalog = new ArrayList<>();

    ArrayList<String> genre1 = new ArrayList<>();
    genre1.add("Фантастика");
    genre1.add("Книга1");
    genre1.add("Книга2");
    genre1.add("Книга3");

    ArrayList<String> genre2 = new ArrayList<>();
    genre2.add("Классика");
    genre2.add("Книга1");
    genre2.add("Книга2");
    genre2.add("Книга3");

    ArrayList<String> genre3 = new ArrayList<>();
    genre3.add("Детектив");
    genre3.add("Книга1");
    genre3.add("Книга2");
    genre3.add("Книга3");

    catalog.add(genre1);
    catalog.add(genre2);
    catalog.add(genre3);

    for (ArrayList<String> genre : catalog) {
      System.out.println("Жанр : " + genre.get(0));
      for (int index = 1; index < genre.size(); index++) {
        System.out.println(genre.get(index));

      }

    }

  }

}