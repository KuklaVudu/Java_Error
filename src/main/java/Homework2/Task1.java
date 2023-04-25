package Homework2;
/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
   введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,вместо этого,
   необходимо повторно запросить у пользователя ввод данных.
*/
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        floatNumber();
    }

    public static void floatNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String string = scan.nextLine();

        try {
            float number = Float.parseFloat(string);
            System.out.println("Ваше число: " + number);
        } catch (NumberFormatException ex) {
            System.out.println("Это не дробное число! Введите дробное число.");
            floatNumber();
        }
    }
}

