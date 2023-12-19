public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea(double a) {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "radius  " + radius + "color   " + color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea(circle.radius));


    }
}




