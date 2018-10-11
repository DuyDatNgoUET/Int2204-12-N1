package neon.com;

public class fruit {
    private String kg;// khối lượng
    private String dateAdd;// ngày nhập
    private String madeIn;// xuất xứ
    private int amount;// số lượng
    private int price ; // giá

    /**
     * constructer không có tham số
     */
    public fruit() {
    }

    /**
     * constructer đầy đủ tham số
     * @param kg
     * @param dateAdd
     * @param madeIn
     * @param amount
     * @param price
     */
    public fruit(String kg, String dateAdd, String madeIn, int amount, int price) {
        this.kg = kg;
        this.dateAdd = dateAdd;
        this.madeIn = madeIn;
        this.amount = amount;
        this.price = price;
    }

    /**
     * hàm trả về biến kg
     * @return
     */
    public String getKg() {
        return kg;
    }

    /**
     * hàm khởi tạo biến kg
     * @param kg
     */
    public void setKg(String kg) {
        this.kg = kg;
    }

    /**
     * hàm trả về biến DateAdd
     * @return
     */
    public String getDateAdd() {
        return dateAdd;
    }

    /**
     * hàm khởi tạo biến dateAdd
     * @param dateAdd
     */
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    /**
     * hàm trả về biến MadeIn
     * @return
     */
    public String getMadeIn() {
        return madeIn;
    }

    /**
     * hàm khởi tạo biến MadeIn
     * @param madeIn
     */

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    /**
     * hàm trả về biến amount
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     * hàm khởi tạo biến amount
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * hàm trả về biến price
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     * hàm khởi tạo biến price
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * hàm đọc dữ liệu từ các đối tượng trên
     * @return
     */
    public String toString() {
        return "Kg : "+kg+" kg\n"+"Date add : "+dateAdd+"\n" + "Made in : "
                +madeIn+"\n"+"Amount : " +amount +"\n" + "Price : " +price+"\n" ;

    }
}
