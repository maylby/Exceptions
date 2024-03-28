package Exceptions.Seminar.Sem01.Task02;

public class Main {
    public static int getElemByIndexInArr(int[] array, int minLen, int value) {
        if (array == null) throw new NullPointerException("Массив не должен быть null!");
        if (array.length < minLen) return -1;
//        int code2 = -2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
//                break;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int result = getElemByIndexInArr(null, 10, 8);
        System.out.println(result);
    }
}
