package lap5.bai2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_one {
    public test_one(){
    }
    @Test
    public void testShape0(){
        Shape test0 = new Shape();
        boolean filled = false;
        String color = "blue";
        String result = "Color : blue\nFilled : false";
        test0.setColor("blue");
        test0.setFilled(false);
        String ExResult = test0.toString();
        assertEquals(result, ExResult);
    }
    @Test
    public void test1(){
        Rectangle test1 = new Rectangle();
        double width = 3;
        double length = 5;
        double area = 15;
        String color = "grey";
        boolean fill = true;
        test1.setLength(5);
        test1.setWidth(3);
        test1.setColor("grey");
        test1.setFilled(true);
        test1.getArea();
        String atest= test1.toString();
        String a = "width: "+width+"\nlength: "+length+"\nArea: "+area
                +"\n"+ "Color : "+ color+"\n"+"Filled : " + fill;
        assertEquals(atest,a);
    }
    @Test
    public void testShape2() {
        Square square = new Square();
        square.setSide(3);
        double result = 3;
        double ExResult = square.getSide();
        assertEquals(result, ExResult,0);
    }

}
