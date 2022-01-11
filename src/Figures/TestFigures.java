package Figures;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("red", 10, 10, 10),
                new Triangle("green", 10, 20, 30),
                new Triangle("red", 10, 20, 15),
                new Rectangle("red", 5, 10),
                new Rectangle("orange", 40, 15),
                new Circle("red", 4),
                new Circle("red", 10),
                new Circle("blue", 5)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor() == "red")
                sum += figure.perimeter();
        }
        return sum;
    }
    public static double calculateRedArea(Figure[] figures){
        double areaSum = 0;
        for (Figure figure : figures) {
            if (figure.getColor() == "red")
                areaSum += figure.area();
        }
        return areaSum;
    }
}
