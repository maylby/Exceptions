/*
Исключения в программировании и их обработка (семинары)
Урок 1. Обработка ошибок в программировании
https://gb.ru/lessons/420867/homework

 */
package Exceptions.HomeWork.Home01.Task02;
/*
* Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.

Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
int[] a - первый массив
int[] b - второй массив
*
Пример
a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3};
Вывод: [3, 3, 3]

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3, 5};
Вывод: [0]
* */

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a.length != b.length) return new int[]{0};
        int size = a.length;
        int[] c = new int[size];
        for (int i = 0; i < size; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = new int[]{4, 5, 6};
//            b = new int[]{1, 2, 3};
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3, 5};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}