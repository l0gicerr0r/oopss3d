public class calArea {
    public static void main(String[] args) {
        shape obj = new shape();

        obj.area(4);
        obj.area(6, 3);
        obj.triangleArea(3, 6);
    }
}

class shape {
    void area(double length, double height) {
        double area = length * height;

        System.out.println("The area of the rectangle is: " + area);
    }

    void area(double radius) {
        double area = 3.14 * radius * radius;

        System.out.println("The area of the rectangle is: " + area);
    }

    void triangleArea(double length, double height) {
        double area = 0.5 * length * height;

        System.out.println("The area of the triangle is: " + area);
    }
}
