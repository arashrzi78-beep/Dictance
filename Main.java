
public class Main {

    public static double calculateDistance(Point point_1, Point point_2) {
        double powX = Math.pow(point_1.getX() - point_2.getX(), 2);
        double powY = Math.pow(point_1.getX() - point_2.getY(), 2);
        return Math.sqrt(powX + powY);
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 1);
        Point p2 = new Point(6, 4);

        p2.setX(8);
        p2.setY(5);

        System.out.println("point 1 = " + p1.display());
        System.out.println("point 2 = " + p2.display());
        System.out.println();
        System.out.println("distance = " + calculateDistance(p1, p2));
    }
}