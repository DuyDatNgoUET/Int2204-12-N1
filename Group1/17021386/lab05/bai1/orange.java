package neon.com;

public class orange extends fruit {
    public String name_orange(){
        return "Họ táo ";
    }
    /**
     * kế thừa toString của class fruit
     * @return
     */
    public String toString(){
        return name_orange()+"\n"+ super.toString();
    }

}
