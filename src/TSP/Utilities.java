package TSP;

public class Utilities {
    public static double findLength(int pointA, int pointB) {
        int c = (pointA * pointA) + (pointB * pointB);
        return Math.sqrt(c);
    }
}
