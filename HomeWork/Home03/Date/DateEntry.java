/*
Правильная проверка валидации даты java?
https://ru.stackoverflow.com/questions/1166190/%D0%9F%D1%80%D0%B0%D0%B2%D0%B8%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B0-%D0%B2%D0%B0%D0%BB%D0%B8%D0%B4%D0%B0%D1%86%D0%B8%D0%B8-%D0%B4%D0%B0%D1%82%D1%8B-java

Есть edittext в него вводиться дата из datepicker в формате dd.MM.yyyy

//считываю выбранный день месяц год
int day = datePicker.getDayOfMonth();
int mon = datePicker.getMonth();
int year = datePicker.getYear();
//в переменную записываю дату строкой
String outdate = String.format("%02d", day) + "." + String.format("%02d", mon + 1) + "." + year;
DateEnterText.setText(outdate); //передаю значение в поле

*/
package Exceptions.HomeWork.Home03.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateEntry {
    private Pattern pattern; // шаблон
    private Matcher matcher; // совпадение

    private static final String DATE_PATTERN = 
        "(0?[1-9]|1[012]) [/.-] (0?[1-9]|[12][0-9]|3[01]) [/.-] ((19|20)\\d\\d)";


    /**
     * Проверка формата даты с помощью регулярного выражения.
     * @param date дата адрес для проверки
     * @return "true" действительный формат даты, "false" неверный
     */
    public boolean validate(final String date){

        matcher = pattern.matcher(date);
        if (matcher.matches()){

            matcher.reset();
            if (matcher.find()){
                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31") && (
                    month.equals("4") || 
                    month .equals("6") || 
                    month.equals("9") ||
                    month.equals("11") || 
                    month.equals("04") || 
                    month .equals("06") ||
                    month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } 
                else if(month.equals("2") || 
                        month.equals("02")){
                    //leap year
                    if (year %4 == 0){
                        if (day.equals("30") || 
                            day.equals("31")){
                            return false;
                        }else return true;
                    } else {
                        if (day.equals("29")||
                            day.equals("30")||
                            day.equals("31")) {
                            return false;
                        } else return true;
                    }
                } else return true;
            } else return false;
        } else return false;
        

//         /* 
//          * код на метод onClick() 
//          */
//         matcher = Pattern.compile(DATE_PATTERN).matcher(Birthday);
        
// // Birthday validator
//     else if (!matcher.matches()) {
//             Toast.makeText(getApplicationContext(), "Invalid Birthday!", Toast.LENGTH_SHORt).show();                    
//         }
        
    }
}
