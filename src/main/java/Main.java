import HomeWork.One.Task1;
import HomeWork.One.Task1b;
import HomeWork.One.Task2;
import HomeWork.One.Task3;


public class Main {
    public static void main(String[] args) {
        Task1 res = new Task1();
        System.out.println("Треугольное число n рано: " + res.res());
        Task1b fact = new Task1b();
        System.out.println("Факториал числа n равен: " + fact.fact());
        Task2 simpleNum = new Task2();
        System.out.println("Все простые числа в диапазоне от 1 до 1000:" + simpleNum.simple());
        Task3 calculator = new Task3();
        System.out.println("Результат равен " + calculator.shoice());
    }
}