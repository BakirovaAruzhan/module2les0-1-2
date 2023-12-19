public class Cirrcle  {
    private double radius;

    public Cirrcle() {
        this.radius = 1.0;
    }

    public Cirrcle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * (Math.PI * radius);
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public static void main(String[] args) {
        Cirrcle cirrcle1 = new Cirrcle();

        cirrcle1.setRadius(2.5);

        System.out.println(cirrcle1.toString());
        System.out.println(cirrcle1.getArea());
        System.out.println(cirrcle1.getCircumference());
    }
}

