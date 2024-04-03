/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869/homework

Аттестационная работа

 */
package Exceptions.HomeWork.Home03;

import java.util.Arrays;
import java.util.Scanner;

public class DataCheck {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String data = scanner.nextLine();
        String[] arr = data.split(" ");
        System.out.println(Arrays.toString(arr));
        // [Фамилия, Имя, Отчество, дата_рождения, номер_телефона, пол]
        if (arr.length != 6) {
            // "throw new ..." своё (?) исключение, наследующее "IndexOutOfBoundsException"
        }
        
    }
}
