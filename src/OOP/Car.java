package OOP;

public class Car{

    private static int year = 0;
    private String color, model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setModel("Mustang");
        car.setYear(1998);
        System.out.println(car.getColor() + car.getYear() + car.getModel());
        car.info();
        System.out.println(car.yearDifference(2004));
    }

    public int yearDifference(int number) {
        return number-Car.year;
    }
    public void info() {
        System.out.println("this is a " + model);
    }
}
