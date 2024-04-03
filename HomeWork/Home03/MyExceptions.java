package Exceptions.HomeWork.Home03;

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
