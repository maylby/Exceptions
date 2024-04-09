/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869/homework

 */
package Exceptions.HomeWork.TestWork;

import java.util.Map;

public class MyExceptions {
    
}

/*
 * Проверка введённых данных
 * Соответствие заданного колличества элементов массива
 * количеству элементов, введенных пользователем
 */
class ArrSizeExp extends IndexOutOfBoundsException{
    public ArrSizeExep() {
       super("Введите данные полностью ");
    }
}


/*
 * несоответствие элемента
 * Класс наследует Unchaced-исключение (непроверяемое) 
 */
class SexException extends IllegalArgumentException {
    public SexException(String m, String f) {
        super(String.format("Укажите пол (муж.: m / жен.: f)", m, f));
    }
}

/*
 * несоответствие элемента числу
 * Класс наследует Unchaced-исключение (непроверяемое) 
 */
class ArgException extends IllegalArgumentException {
    public ArgException(int x, int y) {
        super(String.format("В ячейке [%s][%s] - не число", x, y));
    }

    public ArgException(Map<Integer, String> cache) {
        super(String.format("Не валлидные данные: %s%n", cache)); // "%n" - перенос строки
    }
}