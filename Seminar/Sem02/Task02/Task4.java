package Exceptions.Seminar.Sem02.Task02;

import java.io.*;

/**
* Заставьте выполниться следующий код
*/
public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String str = strings[1];
            test();
            int a = 1 / 0;

            inputStream = new FileInputStream("sdafgdsaf");
        }

        /*
         * Ошибка компиляции:
         * "Недоступный блок catch для StackOverflowError. 
         * Это уже обрабатывается блоком catch для Throwable".
         * Следует изменить порядок размещения в коде
         * Поставить "StackOverflowError" перед "Throwable"
         */
        catch (StackOverflowError error) {
            System.err.println("stack overflow error");
        }

        catch (Throwable e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");

    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }

    /*
     * Метод на проверку "Float"
     * "float" — менее точный тип с плавающей точкой,
     * аналог типа "double"
     */
    private boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return Float.NaN; // Несоответствие типов: невозможно преобразовать 
                              // число с плавающей запятой в логическое значение.
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
