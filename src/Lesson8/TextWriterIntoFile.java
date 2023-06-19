package Lesson8;

import java.io.*;

/*
Писатель в файл с консоли
*/
/*Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.*/


public class TextWriterIntoFile {
    public static void main(String[] args) {
        // напишите тут ваш код
        /*"C:\\Users\\UserName\\Desktop\\JavaRush\\Hello.txt"*/



        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String src = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(src));

            String inputText;
            do {
                inputText = reader.readLine();
                writer.write(inputText);
                writer.newLine(); // Добавляем символ новой строки
            } while (!inputText.equals("exit")); //здесь проверяем условие прерыванияя цикла

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
