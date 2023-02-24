package taskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChoiceResult choiceResult = new ChoiceResult();
        System.out.print("Введите номер реализации: ");
        Scanner scanner1 = new Scanner(System.in);
        int value = scanner1.nextInt();

        System.out.print("Введите число: ");
        Scanner scanner2 = new Scanner(System.in);
        int num = scanner2.nextInt();

        choiceResult.choiceResult(value, num);

    }
}