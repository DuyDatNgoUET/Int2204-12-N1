package lap5.bai2;

public class Shape {
    protected String color;
    protected boolean filled;

    /**
     * constructer không đối số
     */
    public Shape() {
    }

    /**
     * constructer có đối số đầy đủ
     * @param color : màu sắc
     * @param filled : đầy
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    // hàm trả về biến màu
    public String getColor() {
        return color;
    }
    // hàm khởi tạo biến màu
    public void setColor(String color) {
        this.color = color;
    }
    // hàm trả về kết quả biến đầy
    public boolean isFilled() {
        return filled;
    }
    // hàm khởi tạo biến đầy
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * hàm in các đối số
     * @return
     */
    public  String toString(){
        return "Color : "+ getColor()+"\n"+"Filled : " + isFilled();
    }
}
