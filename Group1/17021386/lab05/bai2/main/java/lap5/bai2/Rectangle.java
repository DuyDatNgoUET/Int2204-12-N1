package lap5.bai2;

public class Rectangle extends Shape {
    protected double width;
    protected  double length;

    /**
     * constructer không đối số
     */
    public Rectangle() {
    }

    /**
     * constructer đầy đủ đối số
     * @param width: chiều rộng
     * @param length: chiều dài
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructer có các đối số kế thừa từ class Shape
     * @param color : màu sắc
     * @param filled : điền đầy
     * @param width: chiều rộng
     * @param length: chiều dài
     */
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    // hàm trả về biến chiều rộng
    public double getWidth() {
        return width;
    }
    // hàm khởi tạo biến chiều rộng
    public void setWidth(double width) {
        this.width = width;
    }
    // hàm trả về biến chiều dài
    public double getLength() {
        return length;
    }
    // hàm khởi tạo biến chiều dài
    public void setLength(double length) {
        this.length = length;
    }
    // hàm trả về diện tích HCN
    public double getArea (){
        return getLength()*getWidth();
    }
    //hàm in kết quả của class Rectangle
    public String toString(){
        return "width: "+getWidth()+"\nlength: "+getLength()+"\nArea: "+getArea()
                +"\n"+ super.toString();
    }

}
