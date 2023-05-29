package HomeWork.One;

import groovy.lang.EmptyRange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.codehaus.groovy.runtime.FormatHelper.append;

//2) Вывести все простые числа от 1 до 1000
public class Task2 {
    public List<Integer> simple() {
        int n = 1000;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean simpleNum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simpleNum = false;
                    break;
                }
            }
            if (simpleNum) {
                primes.add(i);
            }
        }
    return primes;
    }
}



