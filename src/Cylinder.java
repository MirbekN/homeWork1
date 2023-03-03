public class Cylinder {
    double height;
    double radius;

    Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    double getSurfaceArea() {
        if (height <= 0 || radius <= 0) {
            throw new IllegalArgumentException("Все параметры должны быть положительными числами");
        }
        return 2 * Math.PI * radius * (height + radius);
    }

    double getVolume() {
        if (height <= 0 || radius <= 0) {
            throw new IllegalArgumentException("Все параметры должны быть положительными числами");
        }
        return Math.PI * radius * radius * height;
    }
}
