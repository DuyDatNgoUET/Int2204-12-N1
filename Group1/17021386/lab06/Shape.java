package neon;

public abstract class Shape {
    private String color;
    private boolean filled;
    //TODO: Constructors
    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //TODO: getters & setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //TODO: Move this shape
    public abstract void moveTo(double x, double y);
    @Override
    public abstract String toString();
    public abstract String position();


}