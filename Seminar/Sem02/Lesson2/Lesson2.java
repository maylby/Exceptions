/*
Исключения в программировании и их обработка (семинары)
Урок 2. Исключения и их обработка
https://gb.ru/lessons/420868

 */


// 00:22:00 (?)
// Добавить приведённый лектолром код

package Exceptions.Seminar.Sem02.Lesson2;

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
// класс Exception являющийся наследником
// класса Throwable, который уже ничего не наследует, т.к.
// является верхним (?) классом в иерархии исключений.

// Но класс Throwable имплементирует 
// интерфейс Serializable (сериализация/десериализация), 
// отвечающий за обмен данными между отдельными приложениями, т.е.
// за трансформацию Java-объекта в джейсон строку, которую
// удобно передавать по сети другому приложению, после чего
// снова трансформировать полученную джейсон строку в Java-объект

// Интерфейс Serializable называется маркировочным, т.к.
// не содержит в себе ни одного метода

