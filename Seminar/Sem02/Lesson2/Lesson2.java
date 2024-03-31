/*
Исключения в программировании и их обработка (семинары)
Урок 2. Исключения и их обработка
https://gb.ru/lessons/420868

 */


// 00:22:00 (?)
// Добавить приведённый лектолром код

package Exceptions.Seminar.Sem02.Lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson2 {

}

// 00:27:30

/**
 * NullPointer
 * Исключение "NullPointerException", 
 * возникшее при обращении к неинициализированному объекту (null)
 */
class NullPointer {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());
    }
 
}

/**
 * IllegalArgument
 * Исключение "",
 * которое генерируется при передаче некорректных агргументов
 * 
 */
class IllegalArgument {
    public static void main(String[] args) {
        System.err.println(Integer.parseInt("13")); // корректная запись числа в строке
                                                      // будет выведено системой, как число
        System.err.println(Integer.parseInt("13ddd")); // некорректная запись числа,
                                                         // будет определено системой, как
                                                         // передача некорректного агргумента 
                                                         // (NumberFormatException)
    } 
}
// Ошибка NumberFormatException наследует (extends) 
// класс IllegalArgumentException, который наследует
// RuntimeException, наследующий
// класс Exception (проверяемые (Checked) и непроверяемые (Anchecked) исключения).
// Exception наследует
// класс Throwable, который не наследует уже ничего, т.к.
// является верхним классом в иерархии исключений, т.е.
// корнем дерева исключений (Exception) и программных ошибок (Error).
// Исключения (Exception) можно обрабатывать,
// Программные ошибки (Error), не обрабатыватся, 
// они требуют переписать код для устранения ошибки
// (Java, Pyhton, возможно, в C#).

// Класс Throwable имплементирует (imlemented (?))
// интерфейс Serializable (сериализация/десериализация), 
// отвечающий за обмен данными между отдельными приложениями, т.е.
// за трансформацию Java-объекта в джейсон строку, которую
// удобно передавать по сети другому приложению, после чего
// снова трансформировать полученную джейсон строку в Java-объект

// Интерфейс Serializable называется маркировочным, т.к.
// не содержит в себе ни одного метода

/**
 * AncheckedException
 * Пример непроверяемых исключений
 */
class AncheckedException {
    public static void main(String[] args) {
        int x = 2 / 0; // AritmeticException - непроверяемое исключение
    }
}

/*
 * "import java.io.FileNotFoundException" и "import java.io.FileReader"
 * перенесены вверх, размещены над строкой "class Lesson2" 
 */
class СheckedException {
    public static void main(String[] args) {
        try {
            /*
             * Строка кода "FileReader", записанная прямо,
             * будет воспринята компилятором, как исключение, требующее обработки.
             * Следует обернуть данную строку в блок "try-catch"
             */
            FileReader fr = new FileReader("1.txt"); 
            System.out.println("Файл прочитан"); // вспомогательная строка
                                                   // для пояснения того, что 
                                                   // адрес файла указан верно
        /*
         * Запись "FileNotFoundException е" подразумевает, что 
         * компилятор создаёт в блоке catch
         * экземпляр класса (FileNotFoundException):
         * "FileNotFoundException е = new FileNotFoundException()".
         * В Java так писать запрещено, код не скомпелируется, т.к.
         * используют более краткую форму записи, но нужно понимать, что 
         * под этой формой записи, на самом деле, скрыт созданный экземпляр класса.
         */
        } catch (FileNotFoundException exception) {
            exception.printStackTrace(); // по умолчанию, распечатать в консоль 
                                         // StackTrace ошибки
                                         // "exception" - это переменная, с которой 
                                         // следует работать, как с обычной переменной
                                         // обозначается как "e", "ex", "exp" и пр.
        }
        System.out.println("Вышли из try-catch");
    }
}


/*
 * два "try-catch" одновременно,
 * один для "FileReader",
 * другой для "FileWriter"
 */
class СheckedException2 {
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("1.txt"); 
            System.out.println("Файл прочитан"); 

        } catch (FileNotFoundException exception) {
            
            try {
                /*
                 * FileWriter - для чтения вывода об обработке исключения
                 * Если файла "error.txt" нет, "FileWriter" его создаст
                 * "true" - для дозаписи очередной обработки, воизбежание перезаписывания
                 */
                FileWriter fw = new FileWriter("error.txt", true); 

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Вышли из try-catch");
    }
}