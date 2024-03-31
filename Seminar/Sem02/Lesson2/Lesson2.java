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


class СheckedException {
    public static void main(String[] args) {
        try {
            /*
             * Строка кода "FileReader", записанная прямо,
             * будет воспринята компилятором, как исключение, требующее обработки.
             * Следует обернуть данную строку в блок "try-catch"
             */
            FileReader fr = new FileReader("1.txt");  
        /*
         * Запись в catch "FileNotFoundException е" 
         * подразумевает следующее:
         * "FileNotFoundException е = new FileNotFoundException()", но
         * так писать нельзя, код не скомпелируется
         */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}