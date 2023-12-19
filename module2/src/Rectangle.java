public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setDimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle:\n" + "Длина: " + length + "\nШирина: " + width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 2);
        System.out.println("Rectangle:");
        System.out.println(rectangle1);

        rectangle1.setDimensions(5, 5);
        System.out.println("\nИзмененный Rectangle:");
        System.out.println(rectangle1);

        int area = rectangle1.calculateArea();
        System.out.println("\nПлощадь Rectangle: " + area);
    }
}
