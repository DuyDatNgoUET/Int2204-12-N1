package neon.com;

public class apple extends fruit {
    public String ap(){
        return "Táo";
    }

    /**
     * kế thừa toString của class fruit
     * @return
     */
    public String toString(){

        return ap()+"\n"+ super.toString();
    }

}
