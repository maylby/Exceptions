/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869/homework

Аттестационная работа

 */
package Exceptions.HomeWork.Home03;

import java.io.FileWriter;
import java.io.IOException;
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
            throw new ArrSizeExp();
        }

        // String dateBirth = arr[3];

        String gender = arr[5];
        if (!gender.equals("m") || !gender.equals("f")) {
            throw new SexException(gender, gender);
        }

        Person p = new Person("Иванов", "Иван", "Иванович", 
                            "11.11.2001", "123456", "m");
        System.out.println(p.toString());

        String fn = arr[0] + ".txt";
        try (FileWriter fw = new FileWriter(fn, true);) {
            fw.write(p.toString() + "\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
