/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869

 */
package Exceptions.Seminar.Sem03.task4;

/*
 * Проверяет равенство числа строк числу элементов массива
 * Наследует Unchaced-исключение (непроверяемое)
 */
public class MyArraySizeException extends IndexOutOfBoundsException{
    public MyArraySizeException(int x, int y) {
        super(String.format("В ячейке [%s][%s] - не число", x, y));  // система выдаёт ошибку, 
                                                                            // ошибки нет
                                                                            // (?) глюк VSCode
    }
}
