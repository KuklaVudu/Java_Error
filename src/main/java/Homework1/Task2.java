package Homework1;

// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        String string = "5246664";
        char indexOf;
        Object character = new Character('$');

        try {
            i = 7 / i;                             // исключение ArithmeticException
            indexOf = string.charAt(10);           //исключение StringIndexOutOfBoundsException
            System.out.println((Byte) character);  //исключением ClassCastException
        } finally {
        }
    }
}
