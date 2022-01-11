package OOP;

import java.sql.SQLOutput;

public class ConstructorTask {
     /*
     Создать класс Мотоцикл (англ. ​Motorbike)​, с  полями “Год выпуска”, “Цвет”,
“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
использовать). Придерживаться принципов инкапсуляции и использовать ключевое
слово ​this.​ Геттером получить год выпуска, цвет, модель, вывести значения в
консоль.
     */
     public static void main(String[] args) {
         Motorbike moto = new Motorbike(1996, "black", "hui");
         System.out.println(moto.getModel() + moto.getYear() + moto.getColor());

     }
}
