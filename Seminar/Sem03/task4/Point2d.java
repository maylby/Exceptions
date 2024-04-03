package Exceptions.Seminar.Sem03.task4;

import java.util.Objects;

public class Point2d {
    private int x;
    private int y;
    
    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%s; %s)", x, y);
    }

    /*
     * Переопределение в "hashCode", 
     * чтобы компилятор пронимал, 
     * какое значение уникальное, а какое нет.
     * Методы переопределены в IJ для краткости, 
     * т.к. VSCode выдаёт слишком длинный код 
     * (см. скрин "Б2-05_(С-03)_01-45-08_Point2d")
     */
    @Override
    public boolean equals(Object o) { 
        if (this == o) return true; // Если в "equals" ссылка данного объекта 
                                    // равна тому, что приходит в аргументы, т.е.
                                    // адрес памяти одинаковый, значит и объект тот же самый, то
                                    // возвращаем "true" (истина)
        if (!(o instanceof Point2d)) return false;  // Если объект НЕ является Point2d, значит 
                                                    // это другой объект, возвращаем "false"
        Point2d point2d = (Point2d) o;
        return x == point2d.x && y == point2d.y; // при совпадении координат, 
                                                 // возвращаем точку (значение?) 
    }

    /*
     * "hashCode" высчитывает из двух чисел некую hash-функцию,
     * являющуюсяся адресом хранения точки в памяти
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
