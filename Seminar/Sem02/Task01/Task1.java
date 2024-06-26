package Exceptions.Seminar.Sem02.Task01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Изучите данный код. Все ли с ним хорошо? Если нет,
* скорректируйте код, попробуйте обосновать свое решение.
*/
public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println(
                "Укажите индекс элемента массива, от 0 до 9 " +
                "в который хотите записать значение 1"
                );
        int index = 0;
        
        /*
         * Проверка ввода целого числа с помощью "if/else"
         * менее ресурсоёмкий способ, чем "try-catch"
         */        
        if (scanner.hasNextInt()) index = scanner.nextInt();
        else  {
            System.out.printf("Индекс должен быть целым числом");
            return;
        }
        try {
            // int index = scanner.nextInt(); // заменено на "int index = 0;"
            //                                // вынесено выше, перед "if/else"
            arr[index] = 1;
            System.out.println("Изменено");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }

        /*
         * Проверка ввода целого числа
         * пресекает ввод букв и дробей
         */
        // catch(InputMismatchException e) {
        //     System.out.printf("Индекс должен быть целым числом" +
        //                     "\nВведите число от 0 до 9: ");
        // }
    }
}
