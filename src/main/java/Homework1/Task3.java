package Homework1;

import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Task3 {
    public static void main(String[] args) {
        int[] firstArray = {5, 4, 6, 5, 8};
        int[] secondArray = {2, 3, 4, 8, 6, 7, 9};
        FillArray(firstArray, secondArray);
    }

    public static void FillArray(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length];
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < secondArray.length; i++) {
                newArray[i] = firstArray[i] - secondArray[i];
            }
            System.out.println(Arrays.toString(newArray));
        } else {
            throw new RuntimeException("Длины массивов не равны");
        }
    }
}
