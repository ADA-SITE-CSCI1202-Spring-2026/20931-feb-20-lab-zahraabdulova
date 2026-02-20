public class ExtremePoints {

    public static void main(String[] args) {

        Point[] points = {
            new Point(3, 5),
            new Point(-2, 10),
            new Point(7, -4),
            new Point(0, 8)
        };

        Point north = points[0];
        Point south = points[0];
        Point east = points[0];
        Point west = points[0];

        for (int i = 1; i < points.length; i++) {

            if (points[i].y > north.y) {
                north = points[i];
            }

            if (points[i].y < south.y) {
                south = points[i];
            }

            if (points[i].x > east.x) {
                east = points[i];
            }

            if (points[i].x < west.x) {
                west = points[i];
            }
        }

        System.out.println("North: " + north);
        System.out.println("South: " + south);
        System.out.println("East: " + east);
        System.out.println("West: " + west);
    }
}
