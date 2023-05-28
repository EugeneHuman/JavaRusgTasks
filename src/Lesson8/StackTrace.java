package Lesson8;

/*Есть пять методов, которые вызывают друг друга.
 Нужно чтобы каждый метод возвращал имя метода,
 вызвавшего его, полученное с помощью StackTrace.
stackTrace[0] - это текущий метод, в котором был вызван Thread.currentThread().getStackTrace().
stackTrace[1] - это метод, который вызвал текущий метод (т.е., предыдущий метод в стеке вызовов).
stackTrace[2] - это метод, который вызвал метод stackTrace[1].
И так далее...

*/
public class StackTrace {
    public static void main(String[] args) {

        method1();

    }

    public static String method1() {
        method2();
        //напишите тут ваш код


        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();


        return elements[2].getMethodName();

    }

    public static String method3() {
        method4();

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

}
