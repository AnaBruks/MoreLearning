package Coll;

import java.util.ArrayList;
import java.util.List;
import Coll.*;

public class Cars {
    public static void main(String[] args) {
//        List<? super Object> cars = new ArrayList<>(5);
//        cars.add("Volvo");
//        cars.add(new Car());
//        cars.add("Volga");
//        cars.add(new Car("Mers"));
//        cars.add(new Car("Kort"));
//
//        for(Object car:cars){
//            System.out.println(car.toString());
//        }

        List<String> Cars = new ArrayList<>();
        Cars.add("Mersedes");
        Cars.add("BMW");
        Cars.add("Niva");
        Cars.add("Reno");
        Cars.add("Toyota");
        System.out.println(Cars); // вывод списка одной строчкой

//        for (int i = 0; i < 5; i++) {
//            Cars.add("Gavno"+ " " + i);
//            System.out.println("Gavno"+ " " + i);
//        }
        for(String gavno: Cars){
            System.out.println(gavno);
        }

        List<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i%2==0)                       //четное число
                number.add(i);
            System.out.print(i + " ");
        }
        for (int i = 300; i <= 350; i++) {
            number.add(i);
            System.out.print(i + " ");
        }
    }
}
