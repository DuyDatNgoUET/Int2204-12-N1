package lap5.bai2;

public class Square extends Rectangle{
    private double side;

    /* Constructor không tham số lớp Square */
    public Square() {
        this.side = this.width;
    }

    /* Constructor đầy đủ tham số lớp Square */
    public Square(double side) {
        this.side = side;
    }

    /* Constructor thừa kế đầy đủ từ lớp Shape của lớp Square */
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    /**
     * Hàm khởi tạo biến side
     * @param
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Hàm trả về biến side
     * @return side
     */
    public double getSide() {
        return side;
    }

    /**
     * Hàm khởi tạo biến width
     * @param
     */
    public void setWidth(double side) {
        this.width = side;
    }

    /**
     * Hàm khởi tạo biến length
     * @param
     */
    public void setLength(double side) {
        this.length = side;
    }

    /* In thông tin */


    public String toString() {
        return "Square\nSide: " + side
                + super.toString() + "\n";
    }

}
