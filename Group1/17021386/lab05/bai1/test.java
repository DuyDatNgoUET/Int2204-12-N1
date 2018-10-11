package neon.com;

public class test {
    public static void main(String[] args){
        apple Ap = new apple();
        Ap.setDateAdd("12");
        Ap.setAmount(100);
        Ap.setKg("0.5");
        Ap.setMadeIn("VN");
        Ap.setPrice(50000);
        System.out.println(Ap.toString());
    }
}
