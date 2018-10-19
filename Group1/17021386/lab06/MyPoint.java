package neon;

public class MyPoint {
    double x, y;
    double a,b,c;
    MyPoint(){
        x=0;
        y=0;
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position: " + '(' + x + ", " + y + ')';
    }
}
