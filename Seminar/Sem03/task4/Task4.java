/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869


01:25:00
 */
package Exceptions.Seminar.Sem03.task4;

/**
Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

1. Далее метод должен пройтись по всем элементам массива, 
преобразовать в число и просуммировать.
Если в каком-то элементе массива преобразование не удалось, 
например, в ячейке лежит символ или текст вместо числа, 
должно быть брошено исключение MyArrayDataException с детализацией, 
в какой именно ячейке лежат неверные данные.

2. В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета, 
сумму элементов, при условии, что подали на вход корректный массив.
*/
public class Task4 {
    // двумерный строковый массив (3х3)
    static String[][] arr = new String[][] {
        {"1", "1.5", "1.5"},
        {"1", "1.5", "1.5"},
        {"1", "1.5", "1.5"}
    };
    
    // метод "main", в котором вызываются исключения
    public static void main(String[] args) {
        System.out.println(sum2d(arr)); // вызов метода (sum2d) с указанием массива (arr)
    }
    
    // метод "sum2d" для вычислений и исключений
    public static double sum2d(String[][] arr) {
        double res = 0;
        // "arr.length" - количество входящих массивов (число строк)
        for (int i = 0; i< arr.length; i++) {
            // "arr[i].length" - количество элементов в массиве (число столбцов)
            for (int j = 0; j < arr[i].length; j++) {
                res += Double.parseDouble(arr[i][j]); // преобразование (parse) строки (String) 
                                                      // в дробное число (Double)
            }
        }
        return res;
    }
}
    