package Homework1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(division(10, 0));
        int[] array = {1, 2, 3, 4, 5};
        IndexOut(array, 7);
        NegativeException();
    }

    public static int division(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Делить на ноль нельзя!");
        return number1 / number2;
    }

    public static void IndexOut(int[] array, int index) {
        if (index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Значение индекса массива, не принадлежит допустимому диапазону");
        }
    }

    public static void NegativeException() {
        try {
            int[] array = new int[-7];
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
