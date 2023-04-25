package Homework2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();

        if (str.equals("")) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
        System.out.print("Ваш текст: " + str);
    }
}
