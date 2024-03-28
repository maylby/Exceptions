/*
Исключения в программировании и их обработка (семинары)
Урок 1. Обработка ошибок в программировании
https://gb.ru/lessons/420867

Что будет на уроке сегодня

* посмотреть откуда могут браться ошибки
* научиться обрабатывать исключительные ситуации с помощью кодов ошибок и исключений
* научиться бросать исключения, когда метод не может выполнить корректно свою работу


Exeptions - исключения
Error - программные ошибки


00:11:30

Деление (divide) на ноль

 */
package Exceptions.Seminar.Sem01.info;

import java.util.Scanner;

public class Info {
    
    static int divide(int a, int b) {
        return a / b;
    }
    /*
     Вывод сообщения об исключении в консоли (ArithmeticException - арифметическая ошибка)

     Exception in thread "main" java.lang.ArithmeticException: / by zero
        at OOP.Homework.Home07.calculator.Calculator.div(Calculator.java:25)        
        at OOP.Homework.Home07.calculator.ViewCalculator.run(ViewCalculator.java:32)
        at OOP.Homework.Home07.calculator.Main.main(Main.java:7)

00:17:30
Код обработки ошибки деления на ноль
     */
    static int divide1(int a, int b){

        if (b == 0) {
            Scanner sc = new Scanner(System. in);

            // "System.err." используют для вывода ошибок (выводит ошибку красным цветом)
            // "System.out." - при отсутствии ошибок (в консоле выводит ошибку белым)
            // ".err" / ".out" - это переменные ссылочного типа
            // Строка ниже читается так:
            // "println" сохранён в классе "System", в поле "out" или "err"
            System.err.println("Делить на ноль нельзя, введите другой аргумент");
                        
                    int x = sc.nextInt();
                    while (x == 0) {
                            System.err.println("Делить на ноль нельзя, введите другой аргумент");
                            x = sc.nextInt();
                    }
            return a / x;
        }
        return a / b;
    }


// 00:27:20

    /*
    * Код try / catch - разбор на следующем занятии
    * Использован как основа для Метода 2 (обработка ошибки "Деление на ноль")
    * Особенности кода:
    * Минус, требует большего объёма памяти, чем код "while", 
    * при работе с ЧПУ, важно экономит память, которой на станках ЧПУ всего 128МБ
    * Плюс, позволяет вести журнал ошибок, сохранять их в лог(?), 
    * т.к. сохранение в консоли ненадёжно, а в коде можно потерять или забыть местонахождение ошибки
    */
    static int divTry(int a, int b){
        int result = 0; 
        try {
            result = a / b;
            
        } catch (ArithmeticException e) {

            throw new RuntimeException("Делить на ноль нельзя");
            // System.err.println("Делить на ноль нельзя"); // serr

        }
        System.out.println("Я после catch"); // "Делить на ноль нельзя"
        return result; 
    }


// 00:27:30

// Метод 2 
// (Обработка ошибки "деление на ноль")

    /*
    * Модифицированный под "while" код "try / catch"
    */
    static int divide3(int a, int b){
        try {
            return a / b; // для цикла "while" пишем "return" вместо "result" (удалён)

        } catch (ArithmeticException e) {

            /* 
            * Цикл "while" вместо строки "throw" (см. исходный код выше)
            * 
            */
            Scanner sc = new Scanner(System. in);
            System.err.println("Делить на ноль нельзя, введите другой аргумент");

            int x = sc.nextInt();
            while (x == 0) {
                System.err.println("Делить на ноль нельзя, введите другой аргумент");
                x = sc.nextInt();
            }
            return a / x;
        }
        // System.out.println("Я после catch");
    }

/*
 
00:34:50

Бизнес логика в программировании - это основная логика приложения.
Т.е., весь код, кроме метода "Main", который являетясь клиентским кодом,
уже обращается, непосредственно, к бизнес логике.


00:37:00
Ошибка переполнения стека
(StackOverflowError)

 */

    /*
    * Рекурсивный метод "foo()" 
    * с непрописанным выходом из рекурсии,
    * пример падения программы при переполнении стека.
    */
    static void foo() {
        int count = 0;
        while (true) {
            count += 10000000;
            System.out.println(count);
            foo(); // циклический вызов методом "foo()" самого себя
        }
    }
    // Выброс в консоль ссылки на ошибку: "StackOverflowError"
}

/*
00:38:57
F12 (информация о коде ошибки)

 */