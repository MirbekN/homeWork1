import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1 - параллелепипед, 2 - цилиндр");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Введите длину параллелепипеда: ");
                double length = scanner.nextDouble();
                System.out.print("Введите ширину параллелепипеда: ");
                double width = scanner.nextDouble();
                System.out.print("Введите высоту параллелепипеда: ");
                double height = scanner.nextDouble();
                Parallelepaped parallelepiped = new Parallelepaped(length,width, height);
                try {
                    double surfaceArea = parallelepiped.getSurfaceArea();
                    double volume = parallelepiped.getVolume();
                    System.out.printf("Площадь поверхности параллелепипеда: %.2f%n", surfaceArea);
                    System.out.printf("Объем параллелепипеда: %.2f%n", volume);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Ошибка: " + ex.getMessage());
                }
            }
            case 2 -> {
                System.out.print("Введите радиус цилиндра: ");
                double radius = scanner.nextDouble();
                System.out.print("Введите высоту цилиндра: ");
                double height = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(height, radius);
                try {
                    double surfaceArea = cylinder.getSurfaceArea();
                    double volume = cylinder.getVolume();
                    System.out.printf("Площадь поверхности цилиндра: %.2f%n", surfaceArea);
                    System.out.printf("Объем цилиндра: %.2f%n", volume);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Ошибка: " + ex.getMessage());
                }
            }
        }
    }
}