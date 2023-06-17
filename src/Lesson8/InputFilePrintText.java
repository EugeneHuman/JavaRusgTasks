package Lesson8;
/*В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.*/

import java.io.*;

public class InputFilePrintText {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String src = "";
        try {
            src = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream fis = null;
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            while ((temp = fis.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }

                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
