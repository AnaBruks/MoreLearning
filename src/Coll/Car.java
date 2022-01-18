package Coll;

public class Car {
    private String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }
    public Car(){ };

    public static String toString(Car car) {
        return car.getModel();
    }
}
