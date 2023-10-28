// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

public class Task2 {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
    System.out.println(findMaxLen(arr));
  }

  public static int findMaxLen(int[] arr) {
    int res = 0;
    int work = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        work++;
        if (work > res) {
          res = work;
        }
      } else
        work = 0;
    }
    return res;
  }
}
