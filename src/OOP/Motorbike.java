package OOP;

public class Motorbike {
    /*
     Создать класс Мотоцикл (англ. ​Motorbike)​, с  полями “Год выпуска”, “Цвет”,
“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
использовать). Придерживаться принципов инкапсуляции и использовать ключевое
слово ​this.​ Геттером получить год выпуска, цвет, модель, вывести значения в
консоль.
     */
    private int year = 0;
    private String color, model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

}
