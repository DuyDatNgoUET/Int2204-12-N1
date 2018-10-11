package neon.com;

public class cao_phong extends  orange {
    public String name_cp(){
        return "Cam cao phong";
    }
    /**
     * kế thừa toString của class fruit
     * @return
     */
    public String toString(){
        return name_cp()+"\n"+ super.toString();
    }
}
