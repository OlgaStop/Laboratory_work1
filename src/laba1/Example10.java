package laba1;
import java.util.Scanner;
import java.time.Year; // Импортируем класс для получения текущего года
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год вашего рождения: ");
        int birthYear = in.nextInt();

        // Получаем текущий год
        int currentYear = Year.now().getValue();

        // Вычисляем возраст
        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет (год рождения: " + birthYear + ")");

        in.close();
    }
}
