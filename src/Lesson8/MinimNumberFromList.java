package Lesson8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Минимальное из N чисел
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими список — метод getIntegerList.
Найти минимальное число среди элементов списка — метод getMinimum.
*/


public class MinimNumberFromList {

    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // Найти минимум тут
        int min = Collections.min(list);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            numbers.add(input);
        }


        return numbers;
    }
}
