package Exceptions.Seminar.Sem02.Task01;

/**
 * Обработайте возможные исключительные ситуации. 
 * "Битые" значения в исходном массиве считайте нулями. 
 * Можно внести в код правки, которые считаете необходимыми
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
            {"1", "1", "12"}, // 0
            {"1", "13", "1", "1", "1"}, // arr
            {"1", "7"}, // 0
            {"е"}, // 0
            {"2", "6"} // 0
        };
        System.out.println(sum2d(arr));

        String[][] arr0 = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"}
        };
        System.out.println(sum2d(arr0));
    }
    
    private static int sum2d(String[][] arr) {
        int sum = 0;
        // try {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    /*
                     * "if-else" вместо "try-catch"
                     */
                    if (isInteger(arr[i][j])) {
                        int val = Integer.parseInt(arr[i][j]);
                        sum += val;
                    }
                    else throw new RuntimeException("Неверные данные");                    
                }
            }
        // } 
        // catch(NumberFormatException e) {
        //     throw new RuntimeException("Неверные данные");
        // }
        return sum;
    }

    /*
     * "Integer.parseInt" - проверка на целое число 
     * "Double.parseDouble" - проверка на любое число, в том числе, целое
     */
    private static boolean isInteger(String str) {
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
