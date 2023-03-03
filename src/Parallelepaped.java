public class Parallelepaped {
    double length;
    double width;
    double height;

     Parallelepaped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getSurfaceArea() {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Все параметры должны быть положительными числами");
        }
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    double getVolume() {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Все параметры должны быть положительными числами");
        }
        return length * width * height;
    }
}

