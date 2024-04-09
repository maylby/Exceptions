/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869/homework

Аттестационная работа

 */
package Exceptions.HomeWork.TestWork;

public class Person {
    String surname;
    String name;
    String patronymic;
    String dateBirth;
    String phone;
    String gender;

    public Person(String surname, String name,String patronymic, 
                String dateBirth, String phone, String gender) {

        this.surname = surname; 
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>%n", 
                            surname, name, patronymic, dateBirth, phone, gender);
    }
}
