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
        catch (Throwable e) {
            e.printStackTrace();
        }
        /*
         * Ошибка компиляции:
         * "Недоступный блок catch для StackOverflowError. 
         * Это уже обрабатывается блоком catch для Throwable".
         */
        catch (StackOverflowError error) {
            System.err.println("stack overflow error");
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

    private boolean isFloat(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
