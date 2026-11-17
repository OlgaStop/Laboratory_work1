package laba1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int first = num - 1;
        int second = num;
        int third = num + 1;

        // Квадрат суммы первых трех чисел
        int sumOfFirstThree = first + second + third;
        int fourth = sumOfFirstThree * sumOfFirstThree;

        System.out.println(first + " " + second + " " + third + " " + fourth);

        in.close();
    }
}
