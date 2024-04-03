/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869

 */
package Exceptions.Seminar.Sem03.task4;

public class MyArraySizeException {
    public MyArraySizeException(int x, int y) {
        super(String.format("В ячейке [%s][%s] - не число", x, y));  // система выдаёт ошибку, 
                                                                            // ошибки нет
                                                                            // (?) глюк VSCode
    }
}
