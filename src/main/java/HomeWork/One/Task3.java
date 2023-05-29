package HomeWork.One;

import java.util.Scanner;

public class Task3 {

    public Integer one() {
        System.out.println("Введите первое число для калькулятора: ");
        Scanner a = new Scanner(System.in);
        int first = a.nextInt();
        return first;
    }

    public Integer sight() {
        System.out.println("Выберите один из пунктов взаимодействия с числами: \n 1. Сложение;\n 2. Вычитание;\n 3. Умножение;\n 4. Деление");
        Scanner c = new Scanner(System.in);
        int symbol = c.nextInt();
        return symbol;
    }

    public Integer two() {
        System.out.println("Введите второе число для калькулятора: ");
        Scanner b = new Scanner(System.in);
        int second = b.nextInt();
        return second;
    }

    public Float shoice() {
        int a = one();
        int b = two();
        int c = sight();
        float resolt = 0;
        switch (c) {
            case 1:
                resolt = a + b;
                break;
            case 2:
                resolt = a - b;
                break;
            case 3:
                resolt = a * b;
                break;
            case 4:
                resolt = (float) a / b;
                break;
            default:
                break;
        }
    return resolt;
    }
}
