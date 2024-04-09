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
        /**
         * Проверка даты рождения (birthday)
         * Соответствие символов числу
         * Общее количество символов
         * Количество символов в блоках год, месяц, день
         */
        String[] birthday = arr[3].split("."); 
        System.out.println(birthdayArr.toString(birthday));
        if (!phone.equals(Integer.number)) {
            throw new ArgException();
        } else if (birthdayArr.length != 3) {
            throw new ArrSizeExep();
        } else if (birthdayArr[0].length != 4) {
            throw new ArrSizeExep();
        } else if (birthdayArr[1][2].length != 2) { 
            throw new ArrSizeExep();
        } 

        /**
         * Проверка символов номера телефона (phone) 
         * на соответствие числу (Integer)
         */
        Snring phone = arr[4];
        if (!phone.equals(Integer.number)) {
            throw new ArgException();
        }

        /**
         * Проверка заполнения графы пол
         */
        String gender = arr[5];
        if (!gender.equals("m") || !gender.equals("f")) {
            throw new SexException(gender, gender);
        }

        /**
         * Запись в файл данных, 
         * введённых пользователем
         */
        PersonInfo person = new PersonInfo("Иванов", "Иван", "Иванович", 
                                            "11.11.2001", "123456", "m");
        System.out.println(p.toString()); 
        java.time.LocalDateTime dateTime = java.time.LocalDateTime.now();
        String fileName = arr[0] + ".txt";
        try (FileWriter fw = new FileWriter(fileName, true);) {
            fw.write(person.toString() + dateTime + "\n");
            fw.flush();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
