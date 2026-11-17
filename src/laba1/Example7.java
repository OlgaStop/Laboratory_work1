package laba1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        System.out.println("Ваше имя: " + name + ", ваш возраст: " + age + " лет.");

        in.close();
    }
}
