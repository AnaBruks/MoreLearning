package Interfaces;

public class Main {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse(0, 0);
        wh.toString();
        Picker picker = new Picker();
        Courier courier = new Courier();

        for (int i = 0; i < 1500; i++) {
            picker.doWork(wh);
            courier.doWork(wh);
        }

        picker.bonus(wh);
        courier.bonus(wh);
        picker.bonus(wh);
        courier.bonus(wh);
    }
}
