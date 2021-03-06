package neon.com;

public class Light {
    private String name; // Tên đèn
    private String producer; // Nhà sản xuất
    private int powerCapacity; // Hiệu năng

    /* Constructor không tham số lớp Lamp */
    Lamp() {

    }

    /* Constructor đầy đủ tham số lớp Lamp */
    Lamp(String name, String producer, int powerCapacity) {
        this.name = name;
        this.producer = producer;
        this.powerCapacity = powerCapacity;
    }

    /**
     * Hàm khởi tạo biến name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Hàm trả về biến name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Hàm khởi tạo biến producer
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * Hàm trả về biến producer
     * @return producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Hàm khởi tạo biến powerCapacity
     * @param  powerCapacity
     */
    public void setPowerCapacity(int powerCapacity) {
        this.powerCapacity = powerCapacity;
    }

    /**
     * Hàm trả về biến powerCapacity
     * @return powerCapacity
     */
    public int getPowerCapacity() {
        return powerCapacity;
    }

    /* In ra thông tin Lamp */
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Producer: " + producer);
        System.out.println("Power capacity: " + powerCapacity);
    }
}
