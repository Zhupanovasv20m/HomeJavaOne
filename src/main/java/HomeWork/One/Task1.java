package HomeWork.One;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public Integer number() {
        System.out.println("Введите число n для нахождения треугольного числа: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        return num;
    }

    public Integer res() {
        int[] arr = new int[number()];
        int i = 1;
        for (int index = 0; index < arr.length; index++) {
            arr[index] = i;
            i++;
        }
        int summa = Arrays.stream(arr).sum();
        return summa;
    }
    public Integer fact() {
        int[] arr = new int[number()];
        int i = 1;
        int resolt = 1;
        for (int index = 0; index < arr.length; index++) {
            arr[index] = i;
            resolt = resolt * arr[index];
            i++;
        }
        return resolt;
    }
}
