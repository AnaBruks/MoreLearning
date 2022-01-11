package Figures;

public class Rectangle extends Figure{
    private double width, length;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }
    @Override
    public double area() {
        return width*length;
    }
    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
