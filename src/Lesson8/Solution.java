package Lesson8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set �� �����
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //�������� ��� ��� ���. step 3 - ����� 3
        Iterator<Cat> iter = cats.iterator();
        if (iter.hasNext()){
            cats.remove(iter.next());
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //�������� ��� ��� ���. step 2 - ����� 2
        Set<Cat> cats = new HashSet<>();
        String[] names = {"Vaska", "Tom", "Jerry"};
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - ����� 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - ����� 1

    static class Cat {

    }
}
