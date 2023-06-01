package Lesson8;
/*В методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс возникшего исключения, используя метод printStack.
Можно использовать только один блок try..catch.*/
public class ExeptionTest1 {

        public static void main(String[] args) {
            handleExceptions(new ExeptionTest1());
        }

        public static void handleExceptions(ExeptionTest1 obj) {
            try {
                obj.method1();
                obj.method2();
                obj.method3();
            } catch (NullPointerException e) {
                printStack(e);
            } catch (IndexOutOfBoundsException e) {
                printStack(e);
            } catch (NumberFormatException e) {
                printStack(e);
            }

        }

        public static void printStack(Throwable throwable) {
            System.out.println(throwable);
            for (StackTraceElement element : throwable.getStackTrace()) {
                System.out.println(element);
            }
        }

        public void method1() {
            throw new NullPointerException();
        }

        public void method2() {
            throw new IndexOutOfBoundsException();
        }

        public void method3() {
            throw new NumberFormatException();
        }


}
