package lap5.bai2;

public class Circle extends Shape {
    final double PI = 3.14;
    protected double radius;

    /**
     * constructer không đối số
     * @param
     */
    public Circle(){

    }
    /**
     * constructer có đầy đủ đối số
     * @return
     */
    public Circle(double radius){
        this.radius = radius;
    }
    // hàm khởi tạo biến radius
    public void setRadius(double radius){
        this.radius = radius;
    }
    // hàm trả về biến radius
    public double getRadius(){
        return this.radius;
    }
    public  Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    /**
     * Hàm tính diện tích Circle
     * @return area = PI * radius * radius
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Hàm tính chu vi Circle
     * @return perimeter = PI * 2 * radius
     */
    public double getPerimeter() {
        return PI * 2 * radius;
    }
    /**
     * in thông tin
     */
    public String toString(){
        return "Circle\nRadius: " + radius
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter()
                + super.toString() + "\n";
    }
}
