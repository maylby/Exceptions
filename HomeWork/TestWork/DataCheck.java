/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869/homework

Аттестационная работа

 */
package Exceptions.HomeWork.TestWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DataCheck {
    static Scanner scanner = new Scanner(System.in); // "System.in" - читение данных из консоли
                                                     // "ibm866" - кириллица
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in); // "ibm866"
        String data = scanner.nextLine();
        String[] arr = data.split(" ");
        System.out.println(Arrays.toString(arr));
        // [Фамилия, Имя, Отчество, дата_рождения, номер_телефона, пол]
        if (arr.length != 6) {
            throw new ArrSizeExep();
        }

        Snring phone = arr[4];
        if (!phone.equals(int num)) {
            throw new NumberFormatException();
        }

        String birthday = arr[3]; // дата рождения

        String gender = arr[5];
        if (!gender.equals("m") || !gender.equals("f")) {
            throw new SexException(gender, gender);
        
        PersonInfo person = new PersonInfo("Иванов", "Иван", "Иванович", 
                            "11.11.2001", "123456", "m");
        System.out.println(p.toString()); // "toString" можно не писать,
                                          // Java и так понимает, что в консоли
                                          // Нужно выводить "toString"
        String fileName = arr[0] + ".txt";
            try (FileWriter fw = new FileWriter(fileName, true);) {
                fw.write(person.toString() + "\n");
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
