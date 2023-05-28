package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* программа считывает с консоли строки, пока не будет введена пустая строка.
Поочередно вводятся название города и фамилия семьи, которая живет в этом городе.
Подумай какая структура данных лучше всего подходит для хранения пары "название города - фамилия семьи".
Далее считывается с консоли строка - название города.
Программа должна по названию города выводить на экран фамилию семьи, которая в нем проживает.*/
public class CityFamilu {
    public static void main(String[] args) throws IOException {

        Map<String, String> addressList = new HashMap<>();
        String city;
        String family;
        String writer;
        // считываем с клавиатуры
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                city = reader.readLine();

                if (city.isEmpty()) {
                    break;
                }
                family = reader.readLine();
                addressList.put(city, family);

            }
            // Считываем Город и проводим сравнение с листом
            writer = reader.readLine();
            if (addressList.containsKey(writer)) {
                String familyName = addressList.get(writer);
                System.out.println(familyName);
            } else {
                System.out.println("Фамилия для данного города не найдена");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
