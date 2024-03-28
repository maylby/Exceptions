/*
Исключения в программировании и их обработка (семинары)
Урок 1. Обработка ошибок в программировании
https://gb.ru/lessons/420867

 */
package Exceptions.Seminar.Sem01.Task04;

import java.util.ArrayList;
import java.util.List;
/*
Задание №3 

Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: 

1) метод может работать, только с квадратными массивами (кол-во строк = кол-ву столбцов), 
2) в каждой ячейке может лежать, только значение 0 или 1.

Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим.
Какое преимущество у исключений перед кодами ошибок вы можете назвать в данном случае?
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[2] = 10;
        arr[4] = 7;

        checkArray(arr);
    }
    static void checkArray(Integer[] arr) {
        List<Integer> cache = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                cache.add(i);
//                System.out.println("Элементы:");
//                System.out.printf("%d -> " + arr[i] + ", ", i);
            }
        }
        if (!cache.isEmpty()) throw new RuntimeException("null встретились в индексах: " + cache);
        else System.out.println("null не встретились");
    }
}
