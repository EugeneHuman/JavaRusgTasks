package Lesson8;

/*Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.*/
public class NasledovanieRoditelya {
    public static void main(String[] args) {
        CTO cto = new CTO("Vasya");
        System.out.println(cto);
        cto.workHard();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Worker implements Businessman {
        CTO(String name) {
            super(name);
        }

    }

    public static class Worker implements Businessman {
        public String name;

        Worker(String name) {
            this.name = name;
        }

        @Override
        public void workHard() {
            System.out.println("I working hardly!");
        }
    }
}
