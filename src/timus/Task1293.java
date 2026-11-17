package timus;
import java.util.Scanner;
public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Считываем количество панелей (N), ширину (A) и длину (B)
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        // Площадь одной панели
        long areaOnePanel = (long) a * b;

        // Общая площадь с учетом двух сторон (умножаем на 2)
        long totalArea = (long) n * areaOnePanel * 2;

        // На 1 кв. метр нужно 1 нанограмм, поэтому масса равна площади
        System.out.println(totalArea);

        in.close();
    }
}
