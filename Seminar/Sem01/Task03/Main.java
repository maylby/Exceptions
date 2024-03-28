public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {
                {0, 0, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] arr2 = {
                {0, 0, 1, 1},
                {1, 0, 1, 1, 0},
                {1, 0, 1, 0},
                {1, 0, 1, 0, 1}
        };
        int[][] arr3 = {{0, 0, 1}, {1, 3, 1}, {1, 1, 1}};

        System.out.println(sumArrElems(arr2));
    }

    public static int sumArrElems(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
//                System.out.println(sum);
//                throw new RuntimeException("Размерность массива не соответствует требованиям!");
                System.out.println("Размерность массива не соответствует требованиям!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0 || arr[i][j] > 1)
                    throw new RuntimeException("Содержимое ячеек не соответствует требованиям!");
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
