/*
Исключения в программировании и их обработка (семинары)
Урок 3. Продвинутая работа с исключениями в Java
https://gb.ru/lessons/420869/homework

Аттестационная работа

 */
package Exceptions.HomeWork.Home03;

public class Person {
    String surname;
    String name;
    String patronym;
    String dateBirth;
    String phone;
    String gender;

    public Person(String surname, String name,String patronym, 
                String dateBirth, String phone, String gender) {

        this.surname = surname; 
        this.name = name;
        this.patronym = patronym;
        this.dateBirth = dateBirth;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>%n", 
                            surname, name, patronym, dateBirth, phone, gender);
    }
}
