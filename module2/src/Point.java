public class Point {
    public double x;
    public double y;



    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public  void move(double deltaX, double deltaY){
        this.x+=deltaX;
        this.y+=deltaY;
    }


    @Override
    public String toString() {
        return "Point\n"+ "x  "+x+"\ny  "+y;
    }

    public static void main(String[] args) {
        Point point1= new Point(2,5);

        System.out.print("Before:");
        System.out.println(point1.toString());
        System.out.print("After:");
        point1.move(2,3);
        System.out.println(point1.toString());
    }
}
