import com.sun.jdi.PrimitiveValue;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;


    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;

    }

    public double getPerimetr() {
        return 2.0 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }


    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle();
        System.out.println(rectangle1.toString());

        Rectangle rectangle2= new Rectangle(2,3);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimetr());


        System.out.println(rectangle2.toString());
        System.out.println(rectangle1.getArea());
    }
}
