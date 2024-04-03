package Exceptions.HomeWork.Home03;

// import java.util.Map;

public class MyExceptions {
    
}

/*
 * Проверка введённых данных
 * Соответствие заданного колличества элементов массива
 * количеству элементов, введенных пользователем
 */
class ArrSizeExp extends IndexOutOfBoundsException{
    public ArrSizeExp() {
        super("Введите данные полностью "); 
    }
}


/*
 * Метод бросает ошибку несоответствия элемента
 * Класс наследует Unchaced-исключение (непроверяемое) 
 */
class SexException extends IllegalArgumentException {
    public SexException(String m, String f) {
        super(String.format("Укажите пол (муж.: m / жен.: f)", m, f));
    }

    // public MyArrayDataException(Map<Point2d, String> cache) {
    //     super(String.format("Не валлидные данные: %s%n", cache)); // "%n" - перенос строки
    // }
}