package Interfaces;

public class Picker implements Worker{
    private int salary;
    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork(Warehouse wh) {
        salary+=80;
        wh.setCountOrder(wh.getCountOrder()+1) ;
        System.out.println(salary +" " + wh.getCountOrder());
    }

    @Override
    public void bonus(Warehouse wh) {
        if (wh.getCountOrder()<=1500){
            salary*=3;
            System.out.println(salary);
        }

    }
}
