package Exceptions.Seminar.Sem02.Task01;

import java.util.Scanner;

/**
* Изучите данный код. Все ли с ним хорошо? Если нет,
* скорректируйте код, попробуйте обосновать свое решение.
*/
public class Task01 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println(
                "Укажите индекс элемента массива, " +
                "в который хотите записать значение 1"
                );
        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}
