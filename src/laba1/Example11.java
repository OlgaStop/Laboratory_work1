package laba1;
import java.util.Scanner;
import java.time.Year; // Импортируем класс для получения текущего года
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Пользователь: " + name + ", возраст: " + age + " лет.");

        in.close();
    }
}
