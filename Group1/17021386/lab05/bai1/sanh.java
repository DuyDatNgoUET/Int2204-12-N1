package neon.com;

public class sanh extends orange {


    public String cam_sanh() {
        return "Cam sành";
    }
    /**
     * kế thừa toString của class fruit
     * @return
     */
    public String toString(){
        return cam_sanh()+"\n"+ super.toString();
    }
}
