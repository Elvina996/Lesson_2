public class Main { public static void main(String[] args) throws MyArraySizeException {
    String[][] arr = new String[][]{
            {"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"},
    };
    try {
        System.out.println("Сумма значения массива - " + getSum(arr, 4));
    } catch (MyArraySizeException e) {
        System.out.println(" Неверный размер массива! ");
    } catch (MyArrayDataException e) {
        System.out.println("В ячейке " + e.getCoordinates() + " неверные данные");
    }
}public static int getSum(String[][] arr, int arraySize) throws MyArrayDataException, MyArraySizeException {
        int result = 0;

        if (arr.length != arraySize) {
            throw new MyArraySizeException("Неверный размер массива", arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arraySize) {
                throw new MyArraySizeException("Неверный размер массива", arr[i].length);
            }

            for (int j = 0; j < arr[i].length; ++j) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(" Невозможно выдать цифровое значение!", i, j);
                }
            }
        }
        return result;
    }
}
