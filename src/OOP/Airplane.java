package OOP;

public class Airplane {
    private String producer;
    private int year;
    private double length, weight, fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public String info(){
        return "Изготовитель: " + producer + "\n" + "год выпуска: " + year + "\n" + "dlina: " +length + "\n" + "вес: " + weight + "\n" + "количество топлива в баке: " + getFuel();
    }
    public void fillUp(double addedFuel) {
        fuel+=addedFuel;
        System.out.println(fuel);
    }
    public static void compareAirplanes(Airplane plane1, Airplane plane2){
        if(plane1.length> plane2.length)
            System.out.println("Первый самолет длиннее");
        else if (plane1.length < plane2.length)
            System.out.println("Второй самолет длиннее");
        else
            System.out.println("Самолеты равны по длинне");
    }

    public static void main(String[] args) {
        Airplane plane = new Airplane("Lenovo", 1996, 12.1, 300);
        plane.setYear(2000);
        plane.setLength(12.9);
        System.out.println(plane.info());
        plane.fillUp(12);
        plane.fillUp(100);
        Airplane airplane = new Airplane("daf", 1990, 12.4, 100);
        compareAirplanes(plane, airplane);
    }
}
