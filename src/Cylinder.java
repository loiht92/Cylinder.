public class Cylinder {
    public static final double PI = 3.14;
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume;
        return volume = perimeter * height + 2 * baseArea;
    }

    public static double getBaseArea(int radius) {
        return PI * radius * radius;
    }
    public static double getPerimeter(int radius){
        return 2 * PI * radius;
    }
}
