import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int secondNumber = new Scanner(System.in).nextInt();

        // int firstNumber = 5;     - для ручной проверки
        // int secondNumber = 10;   - для ручной проверки

        int summa = firstNumber + secondNumber;
        System.out.println("Сумма чисел " + firstNumber + " и " + secondNumber + " = " + summa);

        int raznost = firstNumber - secondNumber;
        System.out.println("Разность чисел " + firstNumber + " и " + secondNumber + " = " + raznost);

        int umnogenie = firstNumber * secondNumber;
        System.out.println("Произведение чисел "  + firstNumber + " и " + secondNumber + " = "+ umnogenie);

        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное чисел "  + firstNumber + " и " + secondNumber + " = "+ quotient);

    }

}
