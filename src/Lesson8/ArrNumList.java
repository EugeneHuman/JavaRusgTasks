package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class ArrNumList {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] temp = {5, 2, 4, 7, 0};
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            int[] array = new int[temp[i]];
            for (int j = 0; j < temp[i]; j++) {
                array[i] = 2;
            }
            list.add(array);
        }
        return (ArrayList<int[]>) list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
