public class Point {
    double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
    }
}

class Test {
    public static void main(String[] args) {
        Point origin = new Point(1.0, 12.0, 9.0);
        Point dest = new Point(6.0, 2.0, 3.0);
        System.out.printf("两点之间的距离为:%.2f%n", origin.getDistance(dest));

    }
}