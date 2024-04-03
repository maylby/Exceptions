/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869

 */
package Exceptions.Seminar.Sem03.task4;

/*
 * Метод бросает ошибку несоответствия элемента числу
 * Класс наследует Unchaced-исключение (непроверяемое) 
 */
public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int x, int y) {
        super(String.format("В ячейке [%s][%s] - не число", x, y));
    }
}
