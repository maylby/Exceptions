/*
Исключения в программировании и их обработка (семинары)
Урок 1. Обработка ошибок в программировании
https://gb.ru/lessons/420867

 */
package Exceptions.Seminar.Sem01.Task01;

public class Main {
    public static int getArrayLength(int[] array, int minLen) {
        if (array.length < minLen) return -1;
        else return array.length;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int result = getArrayLength(arr1, 10);
        System.out.println(result);
    }
}
