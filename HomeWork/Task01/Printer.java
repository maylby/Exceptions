/*
* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число
Важно: они не должны принимать никаких аргументов
* */

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[3];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
    }

    public static void divisionByZero() {
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    public static void numberFormatException() {
        String str = "s";
        int num = Integer.parseInt(str);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}