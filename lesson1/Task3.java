// Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task3 {
  public static void main(String[] args) {
    int[] nums = { 5, 3, 2, 5, 0, -10, 2, 3, 5, 5, 5 };
    System.out.println(Arrays.toString(nums));
    moveToEnd(nums, 5);
    System.out.println(Arrays.toString(nums));
  }

  public static void moveToEnd(int[] arr, int num) {
    // Идем по всему массиву
    for (int i = 0; i < arr.length; i++) {
      // Если элемент с искомым значением
      if (arr[i] == num) {
        // Начинаем с конца
        int endIndex = arr.length - 1;

        // Отсутствие замены
        boolean isSwapped = false;
        // Пока индекс конца правее текущего элемента
        while (endIndex > i) {
          // Если в конце есть элемент, неравный num
          if (arr[endIndex] != num) {
            // Меняем их местами
            int temp = arr[i];
            arr[i] = arr[endIndex];
            arr[endIndex] = temp;
            // Запоминаем, что мы их поменяли
            isSwapped = true;
            // Выходим из while
            break;
          }
          // Если элемент конца был равен num, то смещаемся левее
          endIndex--;
        }
        // Если мы ничего не поменяли
        if (!isSwapped)
          // Выходим из for
          break;
      }
    }
  }
}
