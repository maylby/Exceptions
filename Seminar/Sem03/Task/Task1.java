/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869

 */
package Exceptions.Seminar.Sem03.Task;

import java.io.IOException;

/**
Создайте метод doSomething(), который может быть источником одного
из типов checked exceptions(тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
метод doSomething().
*/
public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException{
        throw new IOException(); // для чего нужна эта запись?
    }
}
