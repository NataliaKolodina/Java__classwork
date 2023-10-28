// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.


// 1 вариант
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
  private static Logger myLogger = Logger.getLogger(MyLogger.class.getName());

  public static void main(String[] args) {
    String[] array = listFolder(".");
    System.out.println(Arrays.toString(array));
    writeToFile(array, "file.txt");
    initLogger();
  }

  public static String[] listFolder(String path) {
    File list = new File(path);
    return list.list();
  }

  public static void writeToFile(String[] array, String nameFile) {
    try (FileWriter fileWriter = new FileWriter(nameFile)) {
      for (String file : array) {
        fileWriter.write(file);
      }
      myLogger.log(Level.INFO, "Записали информацию в файл!");
    } catch (Exception e) {
      myLogger.log(Level.ALL, e.toString());

    }
  }

  public static void initLogger() {
    try {
      FileHandler fileHandler = new FileHandler("log.txt");
      myLogger.addHandler(fileHandler);
      SimpleFormatter formatter = new SimpleFormatter();
      fileHandler.setFormatter(formatter);
    } catch (Exception e) {
      System.out.println(e.toString());

    }
  }
}

// 2 вариант

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger
{
private static Logger myLogger = Logger.getLogger(MyLogger.class.getName());
public static void main(String[] args)
{
String[] array = listFolder(".");
System.out.println(Arrays.toString(array));
writeToFile(array, "file.txt");
initLogger();
}
public static String[] listFolder(String path)
{
File list = new File(path);
return list.list();
}
public static void writeToFile(String[] array, String nameFile)
{
try(FileWriter fileWriter = new FileWriter(nameFile))
{
for (String file : array)
{
fileWriter.write(file);
}
// myLogger.log(Level.INFO, "Записали информацию");
}
catch (Exception e)
{
myLogger.log(Level.ALL, e.toString());
}
}
public static void initLogger()
{
try
{
FileHandler fileHandler = new FileHandler("log.txt");
myLogger.addHandler(fileHandler);
SimpleFormatter formatter = new SimpleFormatter();
fileHandler.setFormatter(formatter);
myLogger.log(Level.INFO, "Записали информацию");
}
catch (Exception e)
{
System.out.println(e.toString());
}
}
}