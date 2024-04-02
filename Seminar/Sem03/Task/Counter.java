/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869

 */
package Exceptions.Seminar.Sem03.Task;

import java.io.IOException;

/**
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
можно было работать в блоке try-with-resources. Подумайте, что должно происходить
при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
*/
public class Counter implements AutoCloseable {
    public int num = 1;
    private boolean isClosed = false;

    public void add() throws IOException{
        if (isClosed) {
            throw new IOException("Ресурс закрыт");
        }
        num++;
    }

    @Override
    public void close() throws Exception {
        isClosed = true;        
    }
}

/**
 * InnerCounter
 */
class InnerCounter {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        try (counter) {
            System.out.println(counter.num);
            counter.add();
            System.out.println(counter.num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*
         * вместо блока "try-catch" 
         * создал "throws IOException" в методе "main"
         * для проверки того, что исключение
         * было брошено из "counter.add" (55 строка (VSCode))
         */
        // try {
            counter.add();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
    
}
