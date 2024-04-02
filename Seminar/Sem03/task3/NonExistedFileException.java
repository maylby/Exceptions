/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869

 */
package Exceptions.Seminar.Sem03.task3;

import java.io.FileNotFoundException;

/**
 * Задание 3.2
 * Создайте класс исключения, которое 
 * будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя 
 * сообщение об ошибке.
 */
public class NonExistedFileException extends FileNotFoundException {
    public NonExistedFileException() {
        super("Файл не найден");
    }
}
